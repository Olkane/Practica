package ru.baturov235.baturov_235_task2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ostatokController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField Textfield1;

    @FXML
    private TextField Textfield2;

    @FXML
    private Label kolvo;

    @FXML
    private Button ostatok;

    @FXML
    private Label posled;

    @FXML
    void ResultbtnOnAction(ActionEvent event) {
        int i = Integer.parseInt(Textfield1.getText());
        Textfield2.setText("" + i % 60);


    }

    @FXML
    void initialize() {
        assert Textfield1 != null : "fx:id=\"Textfield1\" was not injected: check your FXML file 'ostatok-view.fxml'.";
        assert Textfield2 != null : "fx:id=\"Textfield2\" was not injected: check your FXML file 'ostatok-view.fxml'.";
        assert kolvo != null : "fx:id=\"kolvo\" was not injected: check your FXML file 'ostatok-view.fxml'.";
        assert ostatok != null : "fx:id=\"ostatok\" was not injected: check your FXML file 'ostatok-view.fxml'.";
        assert posled != null : "fx:id=\"posled\" was not injected: check your FXML file 'ostatok-view.fxml'.";

    }

}
