import java.util.Scanner;

public class PerfectPrimeFactorList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the upper bound: ");
        int num = sc.nextInt();

        System.out.println("These numbers are equal to the product of prime factors: ");

        int count = 0;

        for (int i = 0; i <= num; i++) {
            if (isProductOfPrimeFactor(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.printf("\n[%d numbers found (%,.2f%%)]", count, (double) count / num * 100);
    }

    public static boolean isProductOfPrimeFactor(int aPosInt) {
        int product = 1, clone = aPosInt;

        for (int i = 2; i < aPosInt; i++) {
            if (aPosInt % i == 0 && isPrime(i)) {
                while (clone % i == 0) {
                    clone /= i;
                }
                product *= i;
            }
        }
        if (product == aPosInt) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean isPrime(int aPosInt) {
        if (aPosInt == 1) {
            return true;
        } else {
            for (int i = 2; i < aPosInt; i++) {
                if (aPosInt % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
