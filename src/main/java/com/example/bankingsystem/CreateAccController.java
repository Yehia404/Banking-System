package com.example.bankingsystem;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.regex.Pattern;

public class CreateAccController {
    @FXML
    private Stage stage;
    @FXML private Scene scene;
    @FXML private Parent root;
    @FXML private TextField nameField;
    @FXML private TextField emailField;
    @FXML private PasswordField passField;
    @FXML private Button loginButton;
    @FXML private Button createButton;
    @FXML private Label label;

    public void loginPage(ActionEvent event) throws IOException {
            root = FXMLLoader.load(getClass().getResource("login.fxml"));
            stage = (Stage) loginButton.getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
    }
    private boolean isEmailValid(String email) {
        // Regular expression for email validation
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.com$";

        // Compile the pattern
        Pattern pattern = Pattern.compile(emailRegex);

        // Match the email against the pattern
        return pattern.matcher(email).matches();
    }


    public void createAccountPage(ActionEvent event) throws IOException {
        String name = nameField.getText();
        String email= emailField.getText();
        if(isEmailValid(email)) {
            String password = passField.getText();
            Account acc = new Account(name, password, email, 0);
            Bank.accounts.add(acc);
            label.setStyle("-fx-text-fill: green;");
            label.setText("Your Account ID is "+ String.valueOf(acc.getId()));
        }
        else {
            label.setStyle("-fx-text-fill: red;");
            label.setText("Enter a valid Email");

        }
    }
}
