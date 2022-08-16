module com.example.project02 {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.jfoenix;
    requires AnimateFX;
    requires org.controlsfx.controls;
    opens com.example.project02 to javafx.fxml;
    opens com.example.project02.conrtollers to javafx.fxml;
    opens com.example.project02.conrtollers.servesescontroller to javafx.fxml;
    exports com.example.project02;
    exports com.example.project02.services;
}