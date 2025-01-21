package ru.baturov.task;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import static java.lang.Math.*;

public class ResultController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label D;

    @FXML
    private Label L;

    @FXML
    private Label S;

    @FXML
    private TextField TextField;

    @FXML
    private Button result;

    @FXML
    void initialize() {
        assert D != null : "fx:id=\"D\" was not injected: check your FXML file 'Result-view.fxml'.";
        assert L != null : "fx:id=\"L\" was not injected: check your FXML file 'Result-view.fxml'.";
        assert S != null : "fx:id=\"S\" was not injected: check your FXML file 'Result-view.fxml'.";
        assert TextField != null : "fx:id=\"TextField\" was not injected: check your FXML file 'Result-view.fxml'.";
        assert result != null : "fx:id=\"result\" was not injected: check your FXML file 'Result-view.fxml'.";

    }

    public void result(ActionEvent actionEvent) {
        float s = Float.parseFloat(TextField.getText().toString());
        double PI = 3.14;
        double d = 2 * sqrt(s / PI);
        D.setText("Диаметр =" + d);
        double l = PI * d;
        L.setText("Длина окружности =" + l);
    }
}
