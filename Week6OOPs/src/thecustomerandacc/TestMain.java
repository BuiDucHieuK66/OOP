package thecustomerandacc;

import thecustomerandinvoice.Customer;

public class TestMain {
    public static void main(String[] args) {
        Customer customer1 = new Customer(88, "Tan Ah Teck", 10);
        System.out.println(customer1);

        Account account1 = new Account(88, customer1, 20);
    }
}