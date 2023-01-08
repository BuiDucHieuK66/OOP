package observerwithsubject;

public class HexaObserver extends Observer {
    private String hexa;

    public HexaObserver(Subject subject) {
        super(subject);
        subject.attach(this);
    }

    @Override
    public void update() {
        this.hexa = convertDecimalToHexa(subject.getState());
    }

    private String convertDecimalToHexa(int decimal) {
        return Integer.toHexString(decimal);
    }

    public String toString() {
        return "Hexa number: " + hexa;
    }
}
