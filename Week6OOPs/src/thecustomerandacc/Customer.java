package thecustomerandacc;

public class Customer {
    private int id;
    private String name;
    private char gender;

    public Customer(int id, String name, char gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public String toString() {
        StringBuilder str = new StringBuilder();

        str.append("name(").append(this.id).append(")");

        return str.toString();
    }
}