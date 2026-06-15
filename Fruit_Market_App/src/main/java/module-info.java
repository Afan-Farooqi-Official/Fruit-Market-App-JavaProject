module sample.demo {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens sample.demo to javafx.fxml;
    exports sample.demo;
}