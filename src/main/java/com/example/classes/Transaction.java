package com.example.classes;

public class Transaction {

    private static  int counter= 0;
    private int transactionNo;
    private Account senderAcc;
    private Account receiverAcc;
    private double amount;

    public Transaction(Account senderAcc, Account receiverAcc, double amount) {
        transactionNo = counter++;
        this.senderAcc = senderAcc;
        this.receiverAcc = receiverAcc;
        this.amount = amount;
    }

    public int getTransactionNo() {
        return transactionNo;
    }


    public Account getSenderAcc() {
        return senderAcc;
    }

    public void setSenderAcc(Account senderAcc) {
        this.senderAcc = senderAcc;
    }

    public Account getReceiverAcc() {
        return receiverAcc;
    }

    public void setReceiverAcc(Account receiverAcc) {
        this.receiverAcc = receiverAcc;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Transaction No: " + transactionNo +
                "\nSender Account Name: " + senderAcc.getName() +
                "\nSender ID: " + senderAcc.getId() +
                "\nReceiver Account Name: " + receiverAcc.getName() +
                "\nReciever ID: " + receiverAcc.getId() +
                "\nAmount: " + amount;
    }
}
