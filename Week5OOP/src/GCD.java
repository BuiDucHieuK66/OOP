import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("a should be greater than b");
        System.out.print("Enter a: ");
        int a = sc.nextInt();

        System.out.print("Enter b: ");
        int b = sc.nextInt();

        if (gcd(a, b) == -1) {
            System.out.println("Invalid input");
        } else {
            System.out.println(gcd(a, b));
        }
        sc.close();
    }

    public static int gcd(int a, int b) {
        if (a < b) {
            return -1;
        } else {
            int temp;

            while (b != 0) {
                temp = b;
                b = a % b;
                a = temp;
            }
            return a;
        }
    }
}
