package ru.baturov.pr8.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import static ru.baturov.pr8.util.Manager.showMainStage;
import static ru.baturov.pr8.util.Manager.showStage;

public class iHochyController {
    @FXML
    void goToHome(ActionEvent event) {
        showStage("main-view.fxml" , "Marathon Skills 2016");
    }

    @FXML
    void goToLogin(ActionEvent event) {
        showStage("login-view.fxml" , "Marathon Skills 2016 - Login");
    }

    @FXML
    void goToReg(ActionEvent event) {
        showStage("reg-view.fxml" , "Marathon Skills 2016 – Register as a runner");
    }

    public void goToBack(ActionEvent actionEvent) {
        showStage("main-view.fxml" , "Marathon Skills 2016");
    }
}
