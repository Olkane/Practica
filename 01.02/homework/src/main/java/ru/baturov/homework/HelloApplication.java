package ru.baturov.homework;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import static java.lang.Math.*;

import java.io.IOException;

public class HelloApplication extends Application {
    private Stage primaryStage;
    private Scene scene1;
    private Scene scene2;
    private Scene scene3;


    @Override
    public void start(Stage stage) throws IOException {
        primaryStage = stage;
        scene1 = creatScene1();
        scene2 = creatScene2();
        scene3 = creatScene3();
        primaryStage.setTitle("Task");
        primaryStage.setScene(scene1);
        primaryStage.show();
    }

    private Scene creatScene1() {
        Label titleLabel = new Label("Задание 1");
        titleLabel.setStyle("-fx-font-size:20px;-fx-font-weight:bold;");
        TextField sideAField = new TextField();
        TextField sideBField = new TextField();
        Button calcButton = new Button("Get result");
        Label resultLabel = new Label();
        calcButton.setOnAction(www -> {
            try {
                int a = Integer.parseInt(sideAField.getText());
                int b = Integer.parseInt(sideBField.getText());
                String res = "";
                for (int i = 0; i <= a; i += b){
                    res += i + " ";
                }
                Alert alert = new Alert(Alert.AlertType.NONE, res, ButtonType.CLOSE);
                alert.showAndWait();
            } catch (ArithmeticException e) {
                resultLabel.setText("Ошибка!");
            }
        });
        Button btn1Button = new Button("1");
        Button btn2Button = new Button("2");
        Button btn3Button = new Button("3");
        btn1Button.setOnAction(event -> primaryStage.setScene(scene1));
        btn2Button.setOnAction(event -> primaryStage.setScene(scene2));
        btn3Button.setOnAction(event -> primaryStage.setScene(scene3));
        HBox root2 = new HBox(10, btn1Button, btn2Button, btn3Button);
        root2.setAlignment(Pos.CENTER);
        HBox root1 = new HBox(10, new Label("a="), sideAField, new Label("b="), sideBField);
        root1.setAlignment(Pos.CENTER);
        VBox root = new VBox(20, titleLabel, root1, calcButton, resultLabel, root2);
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(20));
        return new Scene(root, 300, 300);
    }

    private Scene creatScene2() {
        Label titleLabel = new Label("Задание 2");
        titleLabel.setStyle("-fx-font-size:20px;-fx-font-weight:bold;");
        TextField sideAField = new TextField();
        TextField sideBField = new TextField();
        TextField sideCField = new TextField();
        Button calcButton = new Button("Get result");
        Label resultLabel = new Label();
        calcButton.setOnAction(www -> {
            try {
                double a = Double.parseDouble(sideAField.getText());
                double b = Double.parseDouble(sideBField.getText());
                double c = Double.parseDouble(sideCField.getText());
                double res1 = a * b;
                double res2 = b * c;
                String res = min(res1, res2) + " " + max(res1, res2);
                Alert alert = new Alert(Alert.AlertType.NONE, res, ButtonType.CLOSE);
                alert.showAndWait();
            } catch (ArithmeticException e) {
                resultLabel.setText("Error!");
            }
        });
        Button btn1Button = new Button("1");
        Button btn2Button = new Button("2");
        Button btn3Button = new Button("3");
        btn1Button.setOnAction(event -> primaryStage.setScene(scene1));
        btn2Button.setOnAction(event -> primaryStage.setScene(scene2));
        btn3Button.setOnAction(event -> primaryStage.setScene(scene3));
        HBox root2 = new HBox(10, btn1Button, btn2Button, btn3Button);
        root2.setAlignment(Pos.CENTER);
        HBox root1 = new HBox(10, new Label("a="), sideAField, new Label("b="), sideBField, new Label("c="), sideCField);
        root1.setAlignment(Pos.CENTER);
        VBox root = new VBox(20, titleLabel, root1, calcButton, resultLabel, root2);
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(20));
        return new Scene(root, 500, 500);
    }

    private Scene creatScene3() {
        Label titleLabel = new Label("Задание 3");
        titleLabel.setStyle("-fx-font-size:20px;-fx-font-weight:bold;");
        TextField sideXField = new TextField();
        sideXField.setPromptText("Введите x");
        TextField sideYField = new TextField();
        sideYField.setPromptText("Введите y");
        TextField sideMField = new TextField();
        sideMField.setPromptText("Введите m");
        TextField sideNField = new TextField();
        sideNField.setPromptText("Введите n");
        TextField sideAField = new TextField();
        sideAField.setPromptText("Введите A");
        Button calcButton = new Button("Get result");
        Label resultLabel = new Label();
        calcButton.setOnAction(www -> {
            try {
                double x = Double.parseDouble(sideXField.getText());
                double y = Double.parseDouble(sideYField.getText());
                double m = Double.parseDouble(sideMField.getText());
                double n = Double.parseDouble(sideNField.getText());
                double A = Double.parseDouble(sideAField.getText());
                double r = sqrt(pow(x, 2) + pow(y, 2));
                if (pow(m + x, 2) + pow(n + y, 2) <= pow(r, 2) && pow(m + x, 2) + pow(n - A + y, 2) <= pow(r, 2) && pow(m - A + x, 2) + pow(n - A + y, 2) <= pow(r, 2) && pow(m - A + x, 2) + pow(n+ y, 2) <= pow(r, 2)) {
                    Alert alert = new Alert(Alert.AlertType.NONE, "Принадлежит", ButtonType.CLOSE);
                    alert.showAndWait();
                } else {
                    Alert alert = new Alert(Alert.AlertType.NONE, "Не принадлежит", ButtonType.CLOSE);
                    alert.showAndWait();
                }
            } catch (NumberFormatException e) {
                resultLabel.setText("Ошибка");
            }
        });
        Button btn1Button = new Button("1");
        Button btn2Button = new Button("2");
        Button btn3Button = new Button("3");
        btn1Button.setOnAction(event -> primaryStage.setScene(scene1));
        btn2Button.setOnAction(event -> primaryStage.setScene(scene2));
        btn3Button.setOnAction(event -> primaryStage.setScene(scene3));
        HBox root2 = new HBox(10, btn1Button, btn2Button, btn3Button);
        root2.setAlignment(Pos.CENTER);
        VBox root11 = new VBox(10, new Label("Окружность:"), sideXField, sideYField);
        VBox root12 = new VBox(10, new Label("Квадрат:"), sideMField, sideNField, sideAField);
        root11.setAlignment(Pos.CENTER);
        root12.setAlignment(Pos.CENTER);
        HBox root1 = new HBox(10, root11, root12);
        root1.setAlignment(Pos.CENTER);
        VBox root = new VBox(20, titleLabel, root1, calcButton, resultLabel, root2);
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(20));
        return new Scene(root, 500, 500);
    }

    public static void main(String[] args) {
        launch();
    }
}