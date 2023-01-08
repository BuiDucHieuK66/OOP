package observerwithsubject;

public class OctalObserver extends Observer {
    private String octal;

    public OctalObserver(Subject subject) {
        super(subject);
        subject.attach(this);
    }

    @Override
    public void update() {
        this.octal = convertDecimalToOctal(subject.getState());
    }

    private String convertDecimalToOctal(int decimal) {
        return Integer.toOctalString(decimal);
    }

    public String toString() {
        return "Octal number: " + octal;
    }
}
