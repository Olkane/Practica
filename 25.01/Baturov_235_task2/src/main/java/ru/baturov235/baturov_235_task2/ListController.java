package ru.baturov235.baturov_235_task2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class ListController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button OKBut;

    @FXML
    private TextField TextField;

    @FXML
    private ListView<Integer> View;

    @FXML
    private Button addBut;

    @FXML
    private Label answerLabel;

    @FXML
    private Button canselBut;

    @FXML
    void OKButOnAction(ActionEvent event) {
        int count = 0;
        for (Integer number : View.getItems()) {
            if (number % 3 == 0 && number % 10 == 2) {
                count++;
            }
        }
        answerLabel.setText(String.valueOf(count));
    }

    @FXML
    void addButOnAction(ActionEvent event) {
        try {
            View.getItems().add(Integer.parseInt(TextField.getText()));
            TextField.clear();
        } catch (NumberFormatException e) {
        }
    }

    @FXML
    void canselButOnAction(ActionEvent event) {
        View.getItems().clear();
        answerLabel.setText("");
        TextField.clear();
    }

    @FXML
    void initialize() {
        assert OKBut != null : "fx:id=\"OKBut\" was not injected: check your FXML file 'list-view.fxml'.";
        assert TextField != null : "fx:id=\"TextField\" was not injected: check your FXML file 'list-view.fxml'.";
        assert View != null : "fx:id=\"View\" was not injected: check your FXML file 'list-view.fxml'.";
        assert addBut != null : "fx:id=\"addBut\" was not injected: check your FXML file 'list-view.fxml'.";
        assert answerLabel != null : "fx:id=\"answerLabel\" was not injected: check your FXML file 'list-view.fxml'.";
        assert canselBut != null : "fx:id=\"canselBut\" was not injected: check your FXML file 'list-view.fxml'.";

    }

}
