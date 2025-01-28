package ru.baturov.pagetopage.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import static ru.baturov.pagetopage.util.Manager.showSecondStage;

public class SecondController {

    @FXML
    private Button goon2;

    @FXML
    void GoOn2(ActionEvent event) {
        showSecondStage("MainController.fxml", "Marathon Skills 2016");
    }

}
