package ru.baturov235.baturov_235_task5;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ProcentController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button Btn;

    @FXML
    private Label Resul;

    @FXML
    private TextField Text;

    @FXML
    void BatOnAction(ActionEvent event) {
        double P = Double.parseDouble(Text.getText());
        if (P <= 0 || P >= 50) {
            Resul.setText("Введите правильное значение P");
            return;
        }

        double Dist = 10.0;
        double TotDist = 0.0;
        int daw = 0;

        while (TotDist <= 200.0) {
            TotDist += Dist;
            Dist += Dist * (P / 100);
            daw++;
        }
        Resul.setText("Количество дней: " + daw + "Суммарный пробег: " + TotDist);


    }

    @FXML
    void initialize() {
        assert Btn != null : "fx:id=\"Btn\" was not injected: check your FXML file 'procent-view.fxml'.";
        assert Resul != null : "fx:id=\"Resul\" was not injected: check your FXML file 'procent-view.fxml'.";
        assert Text != null : "fx:id=\"Text\" was not injected: check your FXML file 'procent-view.fxml'.";

    }

}
