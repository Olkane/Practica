package ru.baturov235.baturov_235_task6;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ResultatController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button Btn;

    @FXML
    private Label Result;

    @FXML
    private TextField Text;

    @FXML
    void btnOnAction(ActionEvent event) {
        String saw = Text.getText();
        try {
            int N = Integer.parseInt(saw);
            if (N <= 0) {
                Result.setText("Введите число больше 0");
            } else {
                int sum = 0;
                int count = 0;

                while (N > 0) {
                    sum += N % 10;
                    N /= 10;
                    count++;
                }

                Result.setText("Количество цифр: " + count + ", Сумма цифр: " + sum);
            }
        } catch (NumberFormatException ex) {
            Result.setText("Введите корректное целое число.");
        }

    }

    @FXML
    void initialize() {
        assert Btn != null : "fx:id=\"Btn\" was not injected: check your FXML file 'Resultat-view.fxml'.";
        assert Result != null : "fx:id=\"Result\" was not injected: check your FXML file 'Resultat-view.fxml'.";
        assert Text != null : "fx:id=\"Text\" was not injected: check your FXML file 'Resultat-view.fxml'.";

    }

}
