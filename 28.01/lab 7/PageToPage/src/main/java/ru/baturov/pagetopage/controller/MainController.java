package ru.baturov.pagetopage.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

import static ru.baturov.pagetopage.util.Manager.showSecondStage;

public class MainController {
    @FXML
    private Button goon2;

    @FXML
    void GoOn2(ActionEvent event) {
        showSecondStage("SeconController.fxml", "Marathon Skills 2016 - Register as a runner");
    }
    public void initialize(URL url, ResourceBundle resourceBundle){
        goon2.setStyle("-fx-background-color: #20B2AA; -fx-background-radius: 5px; -fx-text-fill: #ffffff");
    }
}
