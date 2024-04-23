package com.example.bankingsystem;

import com.example.classes.Bank;
import com.example.classes.Loan;
import com.example.classes.Transaction;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

import java.io.IOException;

public class LoanStatementController {
    @FXML private Stage stage;
    @FXML private Scene scene;
    @FXML private Parent root;


    @FXML private Button servicesBtn;
    @FXML private Button loanBtn;
    @FXML private ListView<Loan> listView;
    @FXML private Label label1;
    @FXML private Label label2;

    public void loanStatement(){
        ObservableList<Loan> observableList = FXCollections.observableArrayList(Bank.user.getLoans());
        listView.setItems(observableList);

        listView.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null) {
                Loan loan = newValue;

                label1.setText("Loan Id: " + loan.getLoanId());
                label2.setText("Loan Amount: " + loan.getLoanAmount());

            }
        });
    }


    public void servicesPage(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("services.fxml"));
        stage = (Stage) servicesBtn.getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void loanPage(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("loan.fxml"));
        stage = (Stage) loanBtn.getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
