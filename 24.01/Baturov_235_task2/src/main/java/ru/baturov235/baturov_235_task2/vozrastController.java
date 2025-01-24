package ru.baturov235.baturov_235_task2;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class vozrastController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField TextField;

    @FXML
    private Button btn;

    @FXML
    private Label vozrast;

    @FXML
    void BatOnAction(ActionEvent event) {
        try {
            int saw = Integer.parseInt(TextField.getText());
            if (saw < 20 || saw > 69) {
                vozrast.setText("Возраст должен находиться в диапозоне от 20 до 60");
            } else {
                vozrast.setText(BatOnAction(saw));
            }
        } catch (NumberFormatException e) {
            vozrast.setText("Введите нормальное целое число");
        }
    }
    private String BatOnAction(int saw){
        String daw = "";
        switch (saw){
            case 20: daw = "двадцать"; break;
            case 21: daw = "двадцать один"; break;
            case 22: daw = "двадцать два"; break;
            case 23: daw = "двадцать три"; break;
            case 24: daw = "двадцать четыре"; break;
            case 25: daw = "двадцать пять"; break;
            case 26: daw = "двадцать шесть"; break;
            case 27: daw = "двадцать семь"; break;
            case 28: daw = "двадцать восемь"; break;
            case 29: daw = "двадцать девять"; break;
            case 30: daw = "тридцать"; break;
            case 31: daw = "тридцать один"; break;
            case 32: daw = "тридцать два"; break;
            case 33: daw = "тридцать три"; break;
            case 34: daw = "тридцать четыре"; break;
            case 35: daw = "тридцать пять"; break;
            case 36: daw = "тридцать шесть"; break;
            case 37: daw = "тридцать семь"; break;
            case 38: daw = "тридцать восемь"; break;
            case 39: daw = "тридцать девять"; break;
            case 40: daw = "сорок"; break;
            case 41: daw = "сорок один"; break;
            case 42: daw = "сорок два"; break;
            case 43: daw = "сорок три"; break;
            case 44: daw = "сорок четыре"; break;
            case 45: daw = "сорок пять"; break;
            case 46: daw = "сорок шесть"; break;
            case 47: daw = "сорок семь"; break;
            case 48: daw = "сорок восемь"; break;
            case 49: daw = "сорок девять"; break;
            case 50: daw = "пятьдесят"; break;
            case 51: daw = "пятьдесят один"; break;
            case 52: daw = "пятьдесят два"; break;
            case 53: daw = "пятьдесят три"; break;
            case 54: daw = "пятьдесят четыре"; break;
            case 55: daw = "пятьдесят пять"; break;
            case 56: daw = "пятьдесят шесть"; break;
            case 57: daw = "пятьдесят семь"; break;
            case 58: daw = "пятьдесят восемь"; break;
            case 59: daw = "пятьдесят девять"; break;
            case 60: daw = "шестьдесят"; break;
            case 61: daw = "шестьдесят один"; break;
            case 62: daw = "шестьдесят два"; break;
            case 63: daw = "шестьдесят три"; break;
            case 64: daw = "шестьдесят четыре"; break;
            case 65: daw = "шестьдесят пять"; break;
            case 66: daw = "шестьдесят шесть"; break;
            case 67: daw = "шестьдесят семь"; break;
            case 68: daw = "шестьдесят восемь"; break;
            case 69: daw = "шестьдесят девять"; break;
        }
        String Year;
        if (saw % 10 == 1 && saw % 100 != 11){
            Year = "год";
        }  else if ((saw % 10 >= 2 && saw % 10 <= 4) && (saw % 100 < 10 || saw % 100 >= 20)) {
            Year = "года";
        } else {
            Year = "лет";
        }
        return daw + " " + Year;
    }


    @FXML
    void initialize() {
        assert TextField != null : "fx:id=\"TextField\" was not injected: check your FXML file 'vozrast-view.fxml'.";
        assert btn != null : "fx:id=\"btn\" was not injected: check your FXML file 'vozrast-view.fxml'.";
        assert vozrast != null : "fx:id=\"vozrast\" was not injected: check your FXML file 'vozrast-view.fxml'.";

    }

}
