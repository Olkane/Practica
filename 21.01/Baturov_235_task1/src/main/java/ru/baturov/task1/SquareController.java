package ru.baturov.task1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SquareController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button Result;

    @FXML
    private Label S;

    @FXML
    private TextField TextField1;

    @FXML
    void ResultbtnOnAction(ActionEvent event) {
        S.setText(String.valueOf(Math.pow(Double.parseDouble(TextField1.getText().toString()),2)));

    }

    @FXML
    void initialize() {
        assert Result != null : "fx:id=\"Result\" was not injected: check your FXML file 'proiz-view.fxml'.";
        assert S != null : "fx:id=\"S\" was not injected: check your FXML file 'proiz-view.fxml'.";
        assert TextField1 != null : "fx:id=\"TextField1\" was not injected: check your FXML file 'proiz-view.fxml'.";

    }

}
