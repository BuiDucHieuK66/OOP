package abstractfactory;

public class MacButton implements Button {
    @Override
    public void paint() {
        System.out.println("MacOS button painted");
    }
}
