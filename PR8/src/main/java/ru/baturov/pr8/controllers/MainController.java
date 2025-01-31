package ru.baturov.pr8.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import static ru.baturov.pr8.util.Manager.showStage;

public class MainController {

    @FXML
    void ihochy(ActionEvent event) {
        showStage("ihochy-view.fxml" , "Marathon Skills 2016 – Register as a runner");
    }

}