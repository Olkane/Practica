package ru.baturov.pagetopage;

import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

import static ru.baturov.pagetopage.util.Manager.showMainStage;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        showMainStage(stage, "MainController.fxml", "Marathon Skills 2016");
    }

    public static void main(String[] args) {
        launch();
    }
}