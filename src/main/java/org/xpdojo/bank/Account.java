package org.xpdojo.bank;

public class Account {

    private double balance = 0;

    public void deposit(double amount){
        balance += amount;
    }

    public double balance(){
        return balance;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }
}

