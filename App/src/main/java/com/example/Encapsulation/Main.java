package main.java.com.example.Encapsulation;

public class Main { 
     public static void main(String[] args) {
        BankAccount acc = new BankAccount("12345", 1000);
        System.out.println("Account: " + acc.getAccountNumber());
        acc.deposit(500);
        acc.withdraw(200);
        System.out.println("Balance: " + acc.getBalance());
     }
    
}
