package observerwithsubject;

public class BinaryObserver extends Observer {
    private String binary;

    public BinaryObserver(Subject subject) {
        super(subject);
        subject.attach(this);
    }

    public void update() {
        binary = convertDecimalToBinary(subject.getState());
    }

    private String convertDecimalToBinary(int decimal) {
        return Integer.toBinaryString(decimal);
    }

    public String toString() {
        return "Binary number: " + binary;
    }
}
