package singleton;

public class App {
    public static void main(String[] args) {
        Database foo1 = Database.getInstance("FOO");
        System.out.println(foo1 + "     " + foo1.value);

        Database bar = Database.getInstance("BAR");
        System.out.println(bar + "     " + bar.value);
    }
}
