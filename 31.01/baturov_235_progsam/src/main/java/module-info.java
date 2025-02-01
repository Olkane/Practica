module ru.baturov235.baturov_235_progsam {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens ru.baturov235.baturov_235_progsam to javafx.fxml;
    exports ru.baturov235.baturov_235_progsam;
}