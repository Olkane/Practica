package ru.baturov235.baturov_235_task3;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ResultController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label A;

    @FXML
    private Label B;

    @FXML
    private Button Result;

    @FXML
    private TextField TextField1;

    @FXML
    private TextField TextField2;

    @FXML
    private TextField TextField3;

    @FXML
    void resultbtnOnAction(ActionEvent event) {
        double a1 = Double.parseDouble(TextField1.getText());
        double b1 = Double.parseDouble(TextField2.getText());
        double x = -a1/b1;
        TextField3.setText("" + x);


    }

    @FXML
    void initialize() {
        assert A != null : "fx:id=\"A\" was not injected: check your FXML file 'resultat-view.fxml'.";
        assert B != null : "fx:id=\"B\" was not injected: check your FXML file 'resultat-view.fxml'.";
        assert Result != null : "fx:id=\"Result\" was not injected: check your FXML file 'resultat-view.fxml'.";
        assert TextField1 != null : "fx:id=\"TextField1\" was not injected: check your FXML file 'resultat-view.fxml'.";
        assert TextField2 != null : "fx:id=\"TextField2\" was not injected: check your FXML file 'resultat-view.fxml'.";
        assert TextField3 != null : "fx:id=\"TextField3\" was not injected: check your FXML file 'resultat-view.fxml'.";

    }

}
