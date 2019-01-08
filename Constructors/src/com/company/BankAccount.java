package com.company;

import java.util.Scanner;

public class BankAccount {

    // Create a new class for a bank account
    // Create fields for the account number, balance, customer name, email and phone number.
    //
    // Create getters and setters for each field
    // Create two additional methods
    // 1. To allow the customer to deposit funds (this should increment the balance field).
    // 2. To allow the customer to withdraw funds. This should deduct from the balance field,
    // but not allow the withdrawal to complete if their are insufficient funds.
    // You will want to create various code in the Main class (the one created by IntelliJ) to
    // confirm your code is working.
    // Add some System.out.println's in the two methods above as well.

    private int accountNumber =  989697;
    private double balance = 500;
    private String customerName;
    private String email = "email@email.com";
    private int phoneNumber = 5550101;

    public BankAccount(){
        System.out.println("The new constructor was called");
    }

    public BankAccount(int accountNumber, double balance, String customerName, String email,int phoneNumber ){

    }

//    Instead of creating a new method to enter a name I could of used the setter for name
//    public void customerName(String name ){
//        this.customerName = name;
//    }
    public void depositFunds(double deposit){
        this.balance += deposit;
        System.out.println("Account for "+ this.customerName +" Deposit of " + deposit + " complete. New balance is " + this.balance);
    }

    public void withdrawFunds(double withdrawal){
        if (this.balance - withdrawal < 0){
            System.out.println(this.customerName + " Not enough monies only have " + this.balance + " left in account" );
        }else {
            this.balance -= withdrawal;
            System.out.println(this.customerName + " Withdrawal of " + withdrawal + " processed. Remaining Balance = " + this.balance );
        }
    }

    public void setAccountNumber(int accountNumber){

    }
    public void setBalance(int balance){

    }
    public void setCustomerName (String customerName){
        this.customerName = customerName;

    }
    public void setEmail(String email){

    }
    public void setphoneNumber(int phoneNumber){

    }
    public int getAccountNumber(int accountNumber){
        return 1;
    }
    public int getBalance(int balance){
        return 1;
    }
    public String getCustomerName(){
        return customerName;
    }
    public String getEmail(String email){
        return email;
    }
    public int getPhoneNumber(int phoneNumber){
        return 1;
    }




}
