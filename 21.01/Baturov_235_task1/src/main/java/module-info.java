module ru.baturov.baturov_235_task1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.baturov.baturov_235_task1 to javafx.fxml;
    exports ru.baturov.baturov_235_task1;
    exports ru.baturov.task1;
    opens ru.baturov.task1 to javafx.fxml;
}