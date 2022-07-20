package controller;

import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
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
		String celsius = celsiusGrade.getText();
		double celsiusConvert = Double.parseDouble(celsius);
		double fahGrade = tConverter.celsiusToFahrenheit(celsiusConvert);
		fahrenheitGrade.setText(fahGrade+"°");
	
	}
    
	public void setMain(Main main) {
		this.main = main; 
	}

}
