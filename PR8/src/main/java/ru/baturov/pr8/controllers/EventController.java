package ru.baturov.pr8.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

import static ru.baturov.pr8.util.Manager.showMainStage;
import static ru.baturov.pr8.util.Manager.showStage;

public class EventController {

    @FXML
    private ComboBox<String> vsnos;

    @FXML
    private RadioButton R1;

    @FXML
    private RadioButton R2;

    @FXML
    private RadioButton R3;

    @FXML
    void goToBack(ActionEvent event) {
        showStage("login-view.fxml" , "Marathon Skills 2016 - Login");
    }

    @FXML
    void goToHome(ActionEvent event) {
        showStage("main-view.fxml" , "Marathon Skills 2016");
    }

    @FXML
    void onClickReg(ActionEvent event) {
        showStage("thx-view.fxml" , "Marathon Skills 2016 – Registration confirmation");
    }


    @FXML
    public void initialize() {
        vsnos.getItems().addAll("Фонд Кошек", "Фонд Собак");
        ToggleGroup tg = new ToggleGroup();
        R1.setToggleGroup(tg);
        R2.setToggleGroup(tg);
        R3.setToggleGroup(tg);
    }
}
