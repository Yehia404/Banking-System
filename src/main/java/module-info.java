module com.example.bankingsystem {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.bankingsystem to javafx.fxml;
    exports com.example.bankingsystem;
}