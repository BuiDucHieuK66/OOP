package factorymethod;

public class Application {
    private static Dialog dialog;

    public static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowDialog();
        } else {
            dialog = new WebDialog();
        }
    }

    public static void main(String[] args) {
        configure();
        dialog.render();
    }
}
