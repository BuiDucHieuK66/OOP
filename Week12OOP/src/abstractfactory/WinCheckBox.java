package abstractfactory;

public class WinCheckBox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("Window check box painted");
    }
}
