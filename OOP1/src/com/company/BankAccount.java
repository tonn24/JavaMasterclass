package com.company;

public class BankAccount {

    private String number;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;
    
    public BankAccount(String number, double balance, String customerName, String email, String phoneNumber) {
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double amount) {
        if(amount <= 0) {
            System.out.println("Amount has to be more than 0");
        } else {
            this.balance += amount;
            System.out.println("You deposited " + amount + " euros and you have " + this.balance + " euros left");
        }
    }

    public void withdrawFunds(double amount) {
        if((this.balance - amount) < 0) {
            System.out.println("You don't have enough money to withdraw!");
        } else {
            this.balance -= amount;
            System.out.println("You withdrew " + amount + " euros and you have " + this.balance + " euros left.");
        }
    }
}
