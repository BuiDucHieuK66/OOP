import java.util.Scanner;

public class LengthOfARunningNumberSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("n = ");
        int n = sc.nextInt();

        System.out.println(len(n));

        sc.close();
    }

    public static String len(int n) {
        if (n == 1) {
            return "1";
        } else {
            return len(n - 1) + Integer.toString(n);
        }
    }
}
