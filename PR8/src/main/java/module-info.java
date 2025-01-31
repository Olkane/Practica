module ru.baturov.pr8 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.baturov.pr8 to javafx.fxml;
    exports ru.baturov.pr8;
    exports ru.baturov.pr8.controllers;
    opens ru.baturov.pr8.controllers to javafx.fxml;
}