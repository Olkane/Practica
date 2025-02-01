package ru.baturov.pr8.util;

import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;
import ru.baturov.pr8.HelloApplication;

import java.io.IOException;

public class Manager {
    public static Stage mainStage;

    public static void showMainStage(Stage stage, String fxmlFileName, String title) {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/ru/baturov/pr8/" + fxmlFileName));
        try {
            Scene scene = new Scene(fxmlLoader.load());
            stage.setScene(scene);
            stage.setTitle(title);
            stage.setResizable(false);
            mainStage = stage;
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void showStage(String fxmlFileName, String title) {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/ru/baturov/pr8/" + fxmlFileName));
        try {
            Scene scene = new Scene(fxmlLoader.load());
            mainStage.setScene(scene);
            mainStage.setTitle(title);
            mainStage.setResizable(false);
            mainStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
