package ru.baturov235.baturov_235_task3;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class RechalController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button BtnRech;

    @FXML
    private TextField Text1;

    @FXML
    private TextField Text2;

    @FXML
    private Label cisla;

    @FXML
    void BtnOnAction(ActionEvent event) {
        try {
            int A = Integer.parseInt(Text1.getText());
            int B = Integer.parseInt(Text2.getText());

            if (A >= B) {
                cisla.setText("Ошибка: A должно быть меньше B.");
                return;
            }
            StringBuilder result = new StringBuilder();
            int count = 0;
            for (int i = B - 1; i > A; i--) {
                result.append(i).append(" ");
                count++;
            }
            result.append("\nКоличество чисел: ").append(count);
            cisla.setText(result.toString());

        } catch (NumberFormatException ex) {
            cisla.setText("Ошибка: Введите корректные целые числа.");
        }


    }

    @FXML
    void initialize() {
        assert BtnRech != null : "fx:id=\"BtnRech\" was not injected: check your FXML file 'cislo-view.fxml'.";
        assert Text1 != null : "fx:id=\"Text1\" was not injected: check your FXML file 'cislo-view.fxml'.";
        assert Text2 != null : "fx:id=\"Text2\" was not injected: check your FXML file 'cislo-view.fxml'.";
        assert cisla != null : "fx:id=\"cisla\" was not injected: check your FXML file 'cislo-view.fxml'.";

    }

}
