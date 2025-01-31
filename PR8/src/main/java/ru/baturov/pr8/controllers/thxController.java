package ru.baturov.pr8.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import static ru.baturov.pr8.util.Manager.showStage;

public class thxController {
    @FXML
    void goToBack(ActionEvent event) {
        showStage("event-view.fxml" , "Marathon Skills 2016 – Register for an event");
    }

    @FXML
    void goToHome(ActionEvent event) {
        showStage("main-view.fxml" , "Marathon Skills 2016");
    }

}
