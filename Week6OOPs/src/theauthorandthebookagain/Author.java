package theauthorandthebookagain;

public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return this.gender;
    }

    public String toString() {
        StringBuilder str = new StringBuilder();

        str.append("Author[name = ").append(this.name).append(", email = ").append(this.email).append(", gender = ").append(this.gender).append("]");

        return str.toString();
    }
}