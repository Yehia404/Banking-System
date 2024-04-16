package Classes;

import java.util.ArrayList;

public class Bank {

    public static ArrayList<Account> accounts  = new ArrayList<Account>();
    public static Account user;
    public Bank(){
        Account Acc1 = new Account("Yehia","a","Yehiasakr@gmail.com",2000);
        Account Acc2 = new Account("John",  "b", "john@example.com", 1500);
        Account Acc3 = new Account("Emily",  "c", "emily@example.com", 3000);
        Account Acc4 = new Account("Michael", "d", "michael@example.com", 2500);
        Account Acc5 = new Account("Sarah",  "e", "sarah@example.com", 1800);
        accounts.add(Acc1);
        accounts.add(Acc2);
        accounts.add(Acc3);
        accounts.add(Acc4);
        accounts.add(Acc5);

        Acc1.transfer(Acc2,200);
        Acc3.transfer(Acc4,660);
        Acc5.transfer(Acc1,100);

        Acc1.loanRequest(1000000);
        Acc3.loanRequest(2000000);

    }
    public static void main(String[] args){
        Bank bank = new Bank();
        for (Account account : accounts) {
            System.out.println("Name: " + account.getName());
            System.out.println("ID: " + account.getId());
            System.out.println("Email: " + account.getEmail());
            System.out.println("Password: " + account.getPassword());
            System.out.println("Balance: " + account.getBalance());
            System.out.println(account.getLoans());
            System.out.println(account.getRecord());

        }
        Account acc = Login(1,"a");
    }

    public static Account Login(int id,String password){
        for (Account account : accounts) {
            if ((account.getId() == id) && account.getPassword().equals(password)) {
                System.out.println("The Account was found");
                user = account;
                return account;
            }

        }
        System.out.println("The Account was not found");
        return null;
    }
    public static Account searchAcc(int id){
        for (Account account : accounts) {
            if ((account.getId() == id)) {
                System.out.println("The Account was found");
                return account;
            }
        }
        System.out.println("account was not found!");
        return null;
    }
}
