package com.example.bankingsystem;

import com.example.classes.Bank;
import com.example.classes.Transaction;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.stage.Stage;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.IOException;

public class StatementController {
    @FXML
    private Stage stage;
    @FXML
    private Scene scene;
    @FXML private Parent root;


    @FXML private Button servicesBtn;
    @FXML
    private ListView<Transaction> listView;
    @FXML private Label label1;
    @FXML private Label label2;
    @FXML private Label label3;
    @FXML private Label label4;

    public void listStatement() {
        ObservableList<Transaction> observableList = FXCollections.observableArrayList(Bank.user.getTransactions());
        listView.setItems(observableList);

        // Set up a listener for handling item selection
        listView.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null) {
                Transaction transaction = newValue; // Get the selected transaction

                // Set the text of the labels using the transaction details
                label1.setText("Transaction No: " + transaction.getTransactionNo());
                label2.setText("Sender Account: " + transaction.getSenderAcc().getName());
                label3.setText("Receiver Account: " + transaction.getReceiverAcc().getName());
                label4.setText("Amount: " + transaction.getAmount());
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



}
