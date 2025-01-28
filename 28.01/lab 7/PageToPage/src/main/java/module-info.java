module ru.drozzin.pagetopage {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.baturov.pagetopage to javafx.fxml;
    exports ru.baturov.pagetopage;
    exports ru.baturov.pagetopage.controller;
    opens ru.baturov.pagetopage.controller to javafx.fxml;
    exports ru.baturov.pagetopage.util;
    opens ru.baturov.pagetopage.util to javafx.fxml;
}