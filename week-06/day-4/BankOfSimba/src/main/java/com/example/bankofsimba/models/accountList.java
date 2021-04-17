package com.example.bankofsimba.models;


import java.util.ArrayList;
import java.util.List;

public class accountList {
    private final List<BankAccount> accounts;

    public accountList() {
        accounts = new ArrayList<>();
    }

    public void add(String ownerName, double balance, String ownerType, String currency) {
        this.add(new BankAccount(ownerName, balance, ownerType, currency));
    }

    public void add(BankAccount bankAccount) {
        accounts.add(bankAccount);
    }

    public List<BankAccount> getAccounts() {
        return accounts;
    }

    public void raise(int id) {
        BankAccount bankAccount = accounts.get(id-1);
        int amount = bankAccount.isKing() ? 100 : 10;
        bankAccount.setBalance(bankAccount.getBalance() + amount);
    }
}
