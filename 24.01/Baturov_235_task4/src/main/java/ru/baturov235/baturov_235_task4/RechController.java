package ru.baturov235.baturov_235_task4;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class RechController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label Label;

    @FXML
    private TextField Text1;

    @FXML
    private TextField Text2;

    @FXML
    private Button btn;

    @FXML
    void BatOnAction(ActionEvent event) {
        try {
            int saw = Integer.parseInt(Text1.getText());
            int sad = Integer.parseInt(Text2.getText());

            if (saw <= 0 || sad <= 0 || saw <= sad){
                Label.setText("Ошибка: A должно было быть больше B и еще положительным");
                return;
            }
            int daw = 0;
            while (saw >= sad) {
                 saw -= sad;
                 daw++;
            }
            Label.setText("Количество отрезков B: " + daw);
        } catch (NumberFormatException e) {
            Label.setText("Ошибка: введите целые положительные числа");
        }

    }

    @FXML
    void initialize() {
        assert Label != null : "fx:id=\"Label\" was not injected: check your FXML file 'rech-view.fxml'.";
        assert Text1 != null : "fx:id=\"Text1\" was not injected: check your FXML file 'rech-view.fxml'.";
        assert Text2 != null : "fx:id=\"Text2\" was not injected: check your FXML file 'rech-view.fxml'.";
        assert btn != null : "fx:id=\"btn\" was not injected: check your FXML file 'rech-view.fxml'.";

    }

}
