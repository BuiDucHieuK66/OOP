import java.util.Scanner;

public class GCDRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();

        System.out.print("Enter b: ");
        int b  = sc.nextInt();
        if (a > 0 && b > 0) {
            System.out.println("The greatest common divisor is: " + gcd(a, b));
        } else {
            System.out.println("There is no greatest common divisor");
        }
        sc.close();
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
