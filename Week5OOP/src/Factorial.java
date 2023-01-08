import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the n of \"n!\": ");
        int n = sc.nextInt();

        System.out.println(factorialRec(n));
    }

    public static int factorialRec(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorialRec(n - 1);
        }
    }

    public static int factorialFor(int n) {
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
