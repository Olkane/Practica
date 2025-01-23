package ru.baturov235.baturov_235_task1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class cisloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button Btn;

    @FXML
    private Label Okonch;

    @FXML
    private TextField TextField;

    @FXML
    private Label Vvod;

    @FXML
    void resultOnAction(ActionEvent event) {
       int d = Integer.parseInt(TextField.getText());
       if (d % 10 == 7){
            Okonch.setText("Число оканчивается на 7");
        } else {
            Okonch.setText("Число не оканчивается на 7");
        }

    }

    @FXML
    void initialize() {
        assert Btn != null : "fx:id=\"Btn\" was not injected: check your FXML file 'rech-view.fxml'.";
        assert Okonch != null : "fx:id=\"Okonch\" was not injected: check your FXML file 'rech-view.fxml'.";
        assert TextField != null : "fx:id=\"TextField\" was not injected: check your FXML file 'rech-view.fxml'.";
        assert Vvod != null : "fx:id=\"Vvod\" was not injected: check your FXML file 'rech-view.fxml'.";

    }

}
