package thecustomerandacc;

import thecustomerandinvoice.Customer;

public class Account {
    private int id;
    private Customer customer;
    private double balance;

    public Account(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public Account(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
        this.balance = 0.0;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String toString() {
        StringBuilder str = new StringBuilder();

        str.append("name(").append(this.id).append(") balance = $").append(Math.round(this.balance * 100.00) / 100.00);

        return str.toString();
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public Account deposit(double amount) {
        this.balance += amount;

        Account addToBalance = new Account(this.id, this.customer, this.balance);

        return addToBalance;
    }

    public Account withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
        } else {
            System.out.println("amount withdrawn exceeds the current balance!");
        }
        Account afterWithdraw = new Account(this.id, this.customer, this.balance);

        return afterWithdraw;
    }
}