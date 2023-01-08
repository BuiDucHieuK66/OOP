package theauthorandthebookmyturn;

public class Author {
    private String name;
    private String email;

    public Author(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        StringBuilder str = new StringBuilder();

        str.append("Author[name = ").append(this.name).append(", email = ").append(this.email).append("]");

        return str.toString();
    }
}