package ru.baturov235.baturov_235_task3;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class vawController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField TextField1;

    @FXML
    private TextField TextField2;

    @FXML
    private TextField TextField3;

    @FXML
    private Button btn;

    @FXML
    private Label cislo1;

    @FXML
    private Label cislo2;

    @FXML
    private Label cislo3;

    @FXML
    private Label porad;

    @FXML
    void BtnOnAction(ActionEvent event) {
        int q = Integer.parseInt(TextField1.getText());
        int w = Integer.parseInt(TextField2.getText());
        int e = Integer.parseInt(TextField3.getText());
        if (q == w) {
            porad.setText("Отлично от других:" + e);
        } else if (q == e) {
            porad.setText("Отлично от других:" + w);
        } else {
            porad.setText("Отлично от других:" + q);

        }

    }

    @FXML
    void initialize() {
        assert TextField1 != null : "fx:id=\"TextField1\" was not injected: check your FXML file 'viaws-view.fxml'.";
        assert TextField2 != null : "fx:id=\"TextField2\" was not injected: check your FXML file 'viaws-view.fxml'.";
        assert TextField3 != null : "fx:id=\"TextField3\" was not injected: check your FXML file 'viaws-view.fxml'.";
        assert btn != null : "fx:id=\"btn\" was not injected: check your FXML file 'viaws-view.fxml'.";
        assert cislo1 != null : "fx:id=\"cislo1\" was not injected: check your FXML file 'viaws-view.fxml'.";
        assert cislo2 != null : "fx:id=\"cislo2\" was not injected: check your FXML file 'viaws-view.fxml'.";
        assert cislo3 != null : "fx:id=\"cislo3\" was not injected: check your FXML file 'viaws-view.fxml'.";
        assert porad != null : "fx:id=\"porad\" was not injected: check your FXML file 'viaws-view.fxml'.";

    }

}
