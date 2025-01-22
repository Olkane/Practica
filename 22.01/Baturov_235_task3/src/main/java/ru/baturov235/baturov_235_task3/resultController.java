package ru.baturov235.baturov_235_task3;

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
    private Button Baton;

    @FXML
    private Label Nomer;

    @FXML
    private TextField TextField;

    @FXML
    private Label cislo;

    @FXML
    void resultOnAction(ActionEvent event) {
        int den = Integer.parseInt(TextField.getText());
        if (den >= 1 && den <= 365){
            int b = (den + 4 - 1) & 7;
            if (b == 0){
                b = 7;
            }
            Nomer.setText("номер недели:" + b);
        } else {
            Nomer.setText("неправильно");
        }
    }

    @FXML
    void initialize() {
        assert Baton != null : "fx:id=\"Baton\" was not injected: check your FXML file 'result-view.fxml'.";
        assert Nomer != null : "fx:id=\"Nomer\" was not injected: check your FXML file 'result-view.fxml'.";
        assert TextField != null : "fx:id=\"TextField\" was not injected: check your FXML file 'result-view.fxml'.";
        assert cislo != null : "fx:id=\"cislo\" was not injected: check your FXML file 'result-view.fxml'.";

    }

}
