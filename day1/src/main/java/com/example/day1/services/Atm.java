package com.example.day1.services;

import jakarta.jws.WebService;

@WebService
public class Atm {

    public static double balance = 0.0;
    public String login(String name){
        return "Hello " + name;
    }

    public double ViewBalance(){
        return balance;
    }
    public double Withdraw(double amount){
        return balance = balance - amount;
    }

    public double Deposite(double amount){
        return balance = balance + amount;
    }

}
