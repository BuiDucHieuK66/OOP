package factorymethod;

public class WindowButton implements Button {
    @Override
    public void render() {
        System.out.println("Window button rendered!");
    }

    @Override
    public void onClick() {
        System.out.println("Click! Window button says - Hello World!");
    }
}
