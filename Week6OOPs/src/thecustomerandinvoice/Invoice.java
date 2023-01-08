package thecustomerandinvoice;

public class Invoice {
    private int id;
    private Customer customer;
    private double amount;

    public Invoice(int id, Customer customer, double amount) {
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }

    public int getID() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getCustomerID() {
        return customer.getID();
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public int getCustomerDiscount() {
        return customer.getDiscount();
    }

    public double getAmountAfterDiscount() {
        return this.amount - this.amount * customer.getDiscount() / 100;
    }

    public String toString() {
        StringBuilder str = new StringBuilder();

        str.append("Invoice[id = ").append(this.id).append(", customer = ").append(this.customer).append(", amount = ").append(this.amount).append("]");

        return str.toString();
    }
}