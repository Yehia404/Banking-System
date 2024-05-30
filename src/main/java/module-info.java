module com.example.bankingsystem {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.bankingsystem to javafx.fxml;
    exports com.example.bankingsystem;
    exports com.example.classes;
    opens com.example.classes to javafx.fxml;
}