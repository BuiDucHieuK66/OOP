package factorymethod;

public class HTMLButton implements Button {
    @Override
    public void render() {
        System.out.println("Window button rendered");
    }

    @Override
    public void onClick() {
        System.out.println("Click! Web says - Hello World!");
    }
}
