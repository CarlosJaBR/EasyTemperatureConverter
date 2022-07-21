package controller;

import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.TemperatureConverter;

public class ConverterController implements Initializable{

    @FXML
    private TextField celsiusGrade;

    @FXML
    private Label fahrenheitGrade;
    
    private Main main; 
    
    private TemperatureConverter tConverter; 

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		tConverter = new TemperatureConverter();
		celsiusGrade.setText("");
		fahrenheitGrade.setText("0°");
	}
    
	@FXML
    void converterToFahrenheit(ActionEvent event) {
		
		try {
			String celsius = celsiusGrade.getText();
			double celsiusConvert = Double.parseDouble(celsius);
			double fahGrade = tConverter.celsiusToFahrenheit(celsiusConvert);
			fahrenheitGrade.setText(fahGrade+"°F");
		}catch(NumberFormatException e) {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Error Dialog");
			alert.setHeaderText("Look, an Error Dialog");
			alert.setContentText("Ooops, there was an error!");
			alert.showAndWait();
		}
	
	}
    
	public void setMain(Main main) {
		this.main = main; 
	}

}
