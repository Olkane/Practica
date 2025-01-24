package ru.baturov235.baturov_235_task3;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import static java.lang.Math.*;

public class KnopController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextArea Area;

    @FXML
    private Button Btn;

    @FXML
    private TextField TextField1;

    @FXML
    private TextField TextField2;

    @FXML
    void btnOnAction(ActionEvent event) {
        int das;
        double sad;

        try {
            das = Integer.parseInt(TextField1.getText());
            sad = Double.parseDouble(TextField2.getText());

            double a = 0;
            double c = 0;
            double h = 0;
            double S = 0;

            switch (das) {
                case 1:
                    a = sad;
                    c = a * sqrt(2);
                    h = c / 2;
                    S = (a * a) / 2;
                    break;
                case 2:
                    c = sad;
                    a = c / sqrt(2);
                    h = c / 2;
                    S = (c * c) / 4;
                    break;
                case 3:
                    h = sad;
                    c = h * 2;
                    a = c / sqrt(2);
                    S = (a * h) / 2;
                    break;
                case 4:
                    S = sad;
                    a = sqrt(S * 2);
                    c = a * sqrt(2);
                    h = c / 2;
                    break;
                default:
                    Area.setText("Ошибка: выберите правильный элемент");
                    return;
            }
            Area.setText(String.format("Катет a: %.2f\nГипотенуза c: %.2f\nВысота h: %.2f\nПлощадь S: %.2f", a, c, h, S));

        } catch (NumberFormatException e) {
            Area.setText("Ошибка: введите нормальные значения");
        }
    }

    @FXML
    void initialize() {
        assert Area != null : "fx:id=\"Area\" was not injected: check your FXML file 'cnopka-view.fxml'.";
        assert Btn != null : "fx:id=\"Btn\" was not injected: check your FXML file 'cnopka-view.fxml'.";
        assert TextField1 != null : "fx:id=\"TextField1\" was not injected: check your FXML file 'cnopka-view.fxml'.";
        assert TextField2 != null : "fx:id=\"TextField2\" was not injected: check your FXML file 'cnopka-view.fxml'.";

    }

}
