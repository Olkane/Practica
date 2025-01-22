package ru.baturov235.baturov_235_task1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class resultatController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label M;

    @FXML
    private TextField TextField;

    @FXML
    private Button result;

    @FXML
    void ResultbtnOnAction(ActionEvent event) {
        int a = Integer.parseInt(TextField.getText().toString());
        int i = a / 1000;
        M.setText(String.valueOf(i));



    }

    @FXML
    void initialize() {
        assert M != null : "fx:id=\"M\" was not injected: check your FXML file 'resultat-view.fxml'.";
        assert TextField != null : "fx:id=\"TextField\" was not injected: check your FXML file 'resultat-view.fxml'.";
        assert result != null : "fx:id=\"result\" was not injected: check your FXML file 'resultat-view.fxml'.";

    }

}
