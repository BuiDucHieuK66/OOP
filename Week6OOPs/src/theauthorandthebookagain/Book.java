package theauthorandthebookagain;

public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty;

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = 0;
    }

    public Book(String name, Author[] author, double price, int qty) {
        this.name = name;
        this.authors = author;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthor() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String toString() {
        StringBuilder str = new StringBuilder();

        str.append("Book[name = ").append(this.name);

        for (int i = 0; i < authors.length; i++) {
            str.append(", ").append(authors[i]);
        }

        str.append(", price = ").append(this.price).append(", qty = ").append(this.qty).append("]");

        return str.toString();
    }
}