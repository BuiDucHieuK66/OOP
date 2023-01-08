package singleton;

public class Database {
    private static Database instance;
    public String value;

    private Database(String value) {
        this.value = value;
    }

    public static Database getInstance(String value) {
        if (instance == null || instance.value != value) {
            instance = new Database(value);
        }
        return instance;
    }
}
