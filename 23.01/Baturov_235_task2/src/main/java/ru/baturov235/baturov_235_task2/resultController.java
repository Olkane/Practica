package ru.baturov235.baturov_235_task2;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class resultController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField TextField1;

    @FXML
    private TextField TextField2;

    @FXML
    private Button btn;

    @FXML
    private Label poluch;

    @FXML
    private Label vvod;

    @FXML
    void BtnOnAction(ActionEvent event) {
        int saw = Integer.parseInt(TextField1.getText());
        int was;
        if (saw > 0) {
            was = saw - 8;
        } else {
            was = saw + 6;
        }
        TextField2.setText(String.valueOf(was));
    }

    @FXML
    void initialize() {
        assert TextField1 != null : "fx:id=\"TextField1\" was not injected: check your FXML file 'resultat-view.fxml'.";
        assert TextField2 != null : "fx:id=\"TextField2\" was not injected: check your FXML file 'resultat-view.fxml'.";
        assert btn != null : "fx:id=\"btn\" was not injected: check your FXML file 'resultat-view.fxml'.";
        assert poluch != null : "fx:id=\"poluch\" was not injected: check your FXML file 'resultat-view.fxml'.";
        assert vvod != null : "fx:id=\"vvod\" was not injected: check your FXML file 'resultat-view.fxml'.";

    }

}
