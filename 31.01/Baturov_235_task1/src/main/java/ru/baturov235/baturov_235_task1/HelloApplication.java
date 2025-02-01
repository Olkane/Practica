package ru.baturov235.baturov_235_task1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;

import static java.lang.Math.*;

public class HelloApplication extends Application {
    private Stage primaryStage;
    private Scene scene1;
    private Scene scene2;
    private Scene scene3;
    private Scene scene4;


    @Override
    public void start(Stage stage) throws IOException {
        primaryStage = stage;
        scene1 = createScene1();
        scene2 = createScene2();
        scene3 = createScene3();
        scene4 = createScene4();
        primaryStage.setTitle("Практичемкая");
        primaryStage.setScene(scene1);
        primaryStage.show();
    }

    private Scene createScene1() {

        Label titleLabel = new Label("Задание 1");
        titleLabel.setStyle("-f-font-size:20px;-fx-font-weight:bold;");
        TextField sideAField = new TextField();
        Button calcbutton = new Button("Найти площадь");
        Label resultLabel = new Label();

        calcbutton.setOnAction(www -> {
            try {
                double a = Double.parseDouble(sideAField.getText());
                double s = a * a;
                resultLabel.setText("площадь квадрата: " + s);
            } catch (ArithmeticException e) {
                resultLabel.setText("умножение на ноль");
            } finally {
                JOptionPane.showMessageDialog(null, "значение вычеслено");
            }
        });

        Button btn1Button = new Button("1");
        Button btn2Button = new Button("2");
        Button btn3Button = new Button("3");
        Button btn4Button = new Button("4");
        btn1Button.setOnAction(event -> primaryStage.setScene(scene1));
        btn2Button.setOnAction(event -> primaryStage.setScene(scene2));
        btn3Button.setOnAction(event -> primaryStage.setScene(scene3));
        btn4Button.setOnAction(event -> primaryStage.setScene(scene4));
        HBox root2 = new HBox(10, btn1Button, btn2Button, btn3Button, btn4Button);
        root2.setAlignment(Pos.CENTER);
        HBox root1 = new HBox(10, new Label("a="), sideAField);
        root1.setAlignment(Pos.CENTER);
        VBox root = new VBox(20, titleLabel, root1, calcbutton, resultLabel, root2);
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(20));
        return new Scene(root, 500, 400);


    }

    private Scene createScene2() {

        Label titleLabel = new Label("Задание 2");
        titleLabel.setStyle("-f-font-size:20px;-fx-font-weight:bold;");
        TextField sideSField = new TextField();
        Button calcButton = new Button("Вычислить");
        Label resultLLabel = new Label();
        Label resultDLabel = new Label();

        calcButton.setOnAction(event -> {
            try {
                double S = Double.parseDouble(sideSField.getText());
                double D = sqrt(4 * S / PI);
                double L = PI * D;
                resultDLabel.setText("" + D);
                resultLLabel.setText("" + L);
            } catch (Exception e) {
                resultDLabel.setText("Ошибка");
                resultLLabel.setText("Ошибка");
            }

        });
        Button btn1Button = new Button("1");
        Button btn2Button = new Button("2");
        Button btn3Button = new Button("3");
        Button btn4Button = new Button("4");
        btn1Button.setOnAction(event -> primaryStage.setScene(scene1));
        btn2Button.setOnAction(event -> primaryStage.setScene(scene2));
        btn3Button.setOnAction(event -> primaryStage.setScene(scene3));
        btn4Button.setOnAction(event -> primaryStage.setScene(scene4));
        HBox root2 = new HBox(10, btn1Button, btn2Button, btn3Button, btn4Button);
        root2.setAlignment(Pos.CENTER);
        HBox root1 = new HBox(10, new Label("S="), sideSField);
        root1.setAlignment(Pos.CENTER);
        VBox root = new VBox(20, titleLabel, root1, calcButton, resultDLabel, resultLLabel, root2);
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(20));
        return new Scene(root, 500, 400);

    }

    private Scene createScene3() {
        Label titleLabel = new Label("Задание 3");
        titleLabel.setStyle("-f-font-size:20px;-fx-font-weight:bold;");
        TextField sideAField = new TextField();
        TextField sideBField = new TextField();
        Button calcButton = new Button("Вычислить");
        Label resultLLabel = new Label();

        calcButton.setOnAction(event -> {
            try {
                double A = Double.parseDouble(sideAField.getText());
                double B = Double.parseDouble(sideBField.getText());
                double S = -B / A;
                resultLLabel.setText("" + S);
            } catch (Exception e) {
                resultLLabel.setText("Ошибка");
            }
        });
        Button btn1Button = new Button("1");
        Button btn2Button = new Button("2");
        Button btn3Button = new Button("3");
        Button btn4Button = new Button("4");
        btn1Button.setOnAction(event -> primaryStage.setScene(scene1));
        btn2Button.setOnAction(event -> primaryStage.setScene(scene2));
        btn3Button.setOnAction(event -> primaryStage.setScene(scene3));
        btn4Button.setOnAction(event -> primaryStage.setScene(scene4));
        HBox root2 = new HBox(10, btn1Button, btn2Button, btn3Button, btn4Button);
        root2.setAlignment(Pos.CENTER);
        HBox root1 = new HBox(10, new Label("A="), sideAField, new Label("B="), sideBField);
        root1.setAlignment(Pos.CENTER);
        VBox root = new VBox(20, titleLabel, root1, calcButton, resultLLabel, root2);
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(20));
        return new Scene(root, 500, 400);

    }

    private Scene createScene4() {
        Label titleLabel = new Label("Задание 4");
        titleLabel.setStyle("-f-font-size:20px;-fx-font-weight:bold;");
        TextField sideBField = new TextField();
        Button calcButton = new Button("Вычислить");
        Label resultLLabel = new Label();

        calcButton.setOnAction(event -> {
            try {
                double B = Double.parseDouble(sideBField.getText());
                double A = cos(B)+5.1*pow(10,-3);
                double W = pow(A, 5) + sin(A * B)/(Math.sqrt(A * B) + tan(B));
                double V = exp(A * W) + PI;
                resultLLabel.setText("" +V);
            }
            catch (Exception e) {
                resultLLabel.setText("Ошибка");
            }
        });
        Button btn1Button = new Button("1");
        Button btn2Button = new Button("2");
        Button btn3Button = new Button("3");
        Button btn4Button = new Button("4");
        btn1Button.setOnAction(event -> primaryStage.setScene(scene1));
        btn2Button.setOnAction(event -> primaryStage.setScene(scene2));
        btn3Button.setOnAction(event -> primaryStage.setScene(scene3));
        btn4Button.setOnAction(event -> primaryStage.setScene(scene4));
        HBox root2 = new HBox(10, btn1Button, btn2Button, btn3Button, btn4Button);
        root2.setAlignment(Pos.CENTER);
        HBox root1 = new HBox(10, new Label("B="), sideBField);
        root1.setAlignment(Pos.CENTER);
        VBox root = new VBox(20, titleLabel, root1, calcButton, resultLLabel, root2);
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(20));
        return new Scene(root, 500, 400);
    }


        public static void main (String[]args){
            launch();
        }
    }
