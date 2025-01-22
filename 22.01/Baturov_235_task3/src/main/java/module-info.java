module ru.baturov235.baturov_235_task3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.baturov235.baturov_235_task3 to javafx.fxml;
    exports ru.baturov235.baturov_235_task3;
}