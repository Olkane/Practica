package ru.baturov235.baturov_235_task5;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import static java.lang.Math.*;

public class Baturov_task5 {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField X;

    @FXML
    private TextField Y;

    @FXML
    private Button but;

    @FXML
    private Label otvet;

    @FXML
    void initialize() {
        assert X != null : "fx:id=\"X\" was not injected: check your FXML file 'Untitled'.";
        assert Y != null : "fx:id=\"Y\" was not injected: check your FXML file 'Untitled'.";
        assert but != null : "fx:id=\"but\" was not injected: check your FXML file 'Untitled'.";
        assert otvet != null : "fx:id=\"otvet\" was not injected: check your FXML file 'Untitled'.";


    }

    public void ww(ActionEvent actionEvent) {
        double x = Double.parseDouble(X.getText().toString());
        double y = Double.parseDouble(Y.getText().toString());
        if (pow(x,2) + pow(y,2) < pow(10,2) && y < x || y < -x) {
            otvet.setText("Точка входит в зону");
        } else if (pow(x,2) + pow(y,2) == pow(10,2) && y == x && y== -x) {
            otvet.setText("Находится на границе зоны");
        } else {
            otvet.setText("Точка не входит в зону");
        }
    }
}
