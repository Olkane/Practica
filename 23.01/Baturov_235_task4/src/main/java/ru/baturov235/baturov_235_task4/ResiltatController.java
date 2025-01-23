package ru.baturov235.baturov_235_task4;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import static java.lang.Math.*;

public class ResiltatController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label Label;

    @FXML
    private TextField TextField1;

    @FXML
    private TextField TextField2;

    @FXML
    private Button btn;

    @FXML
    void ResulOnAction(ActionEvent event) {
        int saw = Integer.parseInt(TextField1.getText());
        int was = Integer.parseInt(TextField2.getText());
        double y;
        if (saw == 3){
            y = sin(was) + 2;
        } else if (saw == 20) {
            y = cos(pow(was ,2));
        } else if (saw == 15 || saw == 10);{
            y = tan(was) + sin(was);
        }
        Label.setText(String.valueOf(y));

    }

    @FXML
    void initialize() {
        assert Label != null : "fx:id=\"Label\" was not injected: check your FXML file 'rsuil-view.fxml'.";
        assert TextField1 != null : "fx:id=\"TextField1\" was not injected: check your FXML file 'rsuil-view.fxml'.";
        assert TextField2 != null : "fx:id=\"TextField2\" was not injected: check your FXML file 'rsuil-view.fxml'.";
        assert btn != null : "fx:id=\"btn\" was not injected: check your FXML file 'rsuil-view.fxml'.";

    }

}
