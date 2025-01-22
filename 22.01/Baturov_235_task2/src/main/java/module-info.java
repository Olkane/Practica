module ru.baturov235.baturov_235_task2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.baturov235.baturov_235_task2 to javafx.fxml;
    exports ru.baturov235.baturov_235_task2;
}