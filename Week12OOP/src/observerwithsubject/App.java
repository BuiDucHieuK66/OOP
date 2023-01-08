package observerwithsubject;

public class App {
    public static void main(String[] args) {
        Subject subject = new Subject();

        BinaryObserver binaryObserver = new BinaryObserver(subject);
        OctalObserver octalObserver = new OctalObserver(subject);
        HexaObserver hexaObserver = new HexaObserver(subject);

        subject.setState(1234);
        System.out.println(binaryObserver);
        System.out.println(octalObserver);
        System.out.println(hexaObserver);
    }
}
