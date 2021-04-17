package com.example.bankofsimba.models;

public class BankAccount {
    private String name;
    private double balance;
    private String animalType;
    private String currency;

    public BankAccount(String name, double balance, String animalType, String currency) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
        this.currency = currency;
    }

    public BankAccount() {

    }

    public String getName() {
        return name;
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

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public String getBalancePrettified() {
        return String.format("%.2f ", balance);
    }

    public boolean isKing() {
        return name.equals("Simba");
    }

    public boolean isGood() {
        return balance < 10000;
    }
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}