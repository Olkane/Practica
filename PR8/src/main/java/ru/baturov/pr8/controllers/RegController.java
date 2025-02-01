package ru.baturov.pr8.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.input.TouchEvent;

import static ru.baturov.pr8.util.Manager.showStage;

public class RegController {

    @FXML
    private TextField emailET;

    @FXML
    private TextField passwordET;

    @FXML
    private ChoiceBox<String> polET;

    @FXML
    private ChoiceBox<String> stranaET;

    static String email, password;

    @FXML
    void goToBack(ActionEvent event) {
        showStage("ihochy-view.fxml", "Marathon Skills 2016 – Register as a runner");
    }

    @FXML
    void goToHome(TouchEvent event) {
        showStage("main-view.fxml", "Marathon Skills 2016");
    }

    @FXML
    void onClickRef(ActionEvent event) {
        email = emailET.getText();
        password = passwordET.getText();
        showStage("login-view.fxml" , "Marathon Skills 2016 - Login");
    }

    @FXML
    public void initialize() {
        polET.getItems().addAll("Мужской", "Женский");
        stranaET.getItems().addAll("Россия");
    }
}
