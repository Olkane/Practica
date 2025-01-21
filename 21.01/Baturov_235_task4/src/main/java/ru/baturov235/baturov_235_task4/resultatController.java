package ru.baturov235.baturov_235_task4;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import static java.lang.Math.*;

public class resultatController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label B;

    @FXML
    private Button Result;

    @FXML
    private TextField TextField;

    @FXML
    private TextField TextField2;

    @FXML
    void ResultatbtnOnAction(ActionEvent event) {
        double b1 = Double.parseDouble(TextField.getText());
        double a = cos(b1) + 5.1 * pow(10,-3);
        double w = pow(a, 5) + sin(a * b1) / (sqrt(a * b1) + tan(b1));
        double v =exp(a * w) + PI;
        TextField2.setText("" + v);


    }

    @FXML
    void initialize() {
        assert B != null : "fx:id=\"B\" was not injected: check your FXML file 'resultat-view.fxml'.";
        assert Result != null : "fx:id=\"Result\" was not injected: check your FXML file 'resultat-view.fxml'.";
        assert TextField != null : "fx:id=\"TextField\" was not injected: check your FXML file 'resultat-view.fxml'.";
        assert TextField2 != null : "fx:id=\"TextField2\" was not injected: check your FXML file 'resultat-view.fxml'.";

    }

}
