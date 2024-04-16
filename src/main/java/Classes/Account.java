package Classes;

import java.util.ArrayList;
import java.util.Random;

public class Account {
    private String name;
    private static int counter=0;
    private int Id;
    private String password;
    private String email;
    private double balance;
    private ArrayList<Loan> loans;
    private ArrayList<Transaction> record;


    public Account(String name,String password,String email,double balance){
        this.name=name;
        this.balance=balance;
        this.email=email;
        this.password=password;
        this.Id = counter++;
        record= new ArrayList<>();
        loans = new ArrayList<>();
    }
    public boolean withdraw(double amount){
        if(amount > balance){
            System.out.println("amount bigger than your balance");
            return false;
        }
        else{
            balance-=amount;
            System.out.println("Withdraw done successfully");
            return true;
        }
    }
    public void deposit(double amount){
        balance+=amount;
        System.out.println("Deposit done successfully");
    }
    public void loanRequest(double amount){
        Loan loan = new Loan(amount);
        loans.add(loan);
        System.out.println("Loan done successfully");
    }
    public boolean transfer(Account receiver, double amount){

        if(amount > balance){
            System.out.println("amount bigger than your balance");
            return false;
        }
        else{
            Transaction transaction = new Transaction(this,receiver,amount);
            record.add(transaction);
            balance-=amount;
            receiver.setBalance((receiver.getBalance()+amount));
            System.out.println("Transfer done successfully");
            return true;
        }

    }
    public int getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }



    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setId(int id) {
        Id = id;
    }

    public ArrayList<Loan> getLoans() {
        return loans;
    }

    public void setRecord(ArrayList<Transaction> record) {
        this.record = record;
    }

    public void setLoans(ArrayList<Loan> loans) {
        this.loans = loans;
    }

    public ArrayList<Transaction> getRecord() {
        return record;
    }
}
