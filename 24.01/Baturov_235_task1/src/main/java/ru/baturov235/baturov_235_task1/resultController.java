package ru.baturov235.baturov_235_task1;

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
    private Label Label;

    @FXML
    private TextField TextField;

    @FXML
    private Button btn;

    @FXML
    void BtnOnAction(ActionEvent event) {
        try {
            int was = Integer.parseInt(TextField.getText());
            String daw;

            switch (was) {
                case 1:
                    daw = "Плохо";
                    break;
                case 2:
                    daw = "Неудовлетворительно";
                    break;
                case 3:
                    daw = "Удовлетворительно";
                    break;
                case 4:
                    daw = "Хорошо";
                    break;
                case 5:
                    daw = "Отлично";
                    break;
                default:
                    daw = "Ошибка";
            }
            Label.setText(daw);
        } catch (NumberFormatException exception) {
            Label.setText("Ошибка");
        }
    }


    @FXML
    void initialize() {
        assert Label != null : "fx:id=\"Label\" was not injected: check your FXML file 'resultat-view.fxml'.";
        assert TextField != null : "fx:id=\"TextField\" was not injected: check your FXML file 'resultat-view.fxml'.";
        assert btn != null : "fx:id=\"btn\" was not injected: check your FXML file 'resultat-view.fxml'.";

    }

}
