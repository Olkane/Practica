module ru.baturov235.baturov_235_task1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens ru.baturov235.baturov_235_task1 to javafx.fxml;
    exports ru.baturov235.baturov_235_task1;
}