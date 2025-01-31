package ru.baturov.pr8.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.util.Objects;

import static ru.baturov.pr8.controllers.RegController.email;
import static ru.baturov.pr8.controllers.RegController.password;
import static ru.baturov.pr8.util.Manager.showStage;

public class LoginController {

    @FXML
    private TextField emailET;

    @FXML
    private TextField passwordET;

    @FXML
    void goToBack(ActionEvent event) {
        showStage("ihochy-view.fxml" , "Marathon Skills 2016 – Register as a runner");
    }

    @FXML
    void goToHome(ActionEvent event) {
        showStage("main-view.fxml" , "Marathon Skills 2016");
    }

    @FXML
    void onClickLogin(ActionEvent event) {
        String email1 = emailET.getText();
        String password1 = passwordET.getText();
        if (Objects.equals(email1, email) && Objects.equals(password1, password)) {
            showStage("event-view.fxml" , "Marathon Skills 2016 – Register for an event");
        }
    }

}
