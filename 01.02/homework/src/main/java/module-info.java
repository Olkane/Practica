module ru.baturov.homework {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.baturov.homework to javafx.fxml;
    exports ru.baturov.homework;
}