import java.util.Scanner;

public class PrimeList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the upper bound: ");
        int num = sc.nextInt(), count = 0;

        for (int i = 1; i <= num; i++) {
            if (isPrime(i)) {
                count++;
                System.out.print(i + " ");
            }
        }
        System.out.printf("\n[%d primes found (%,.2f%%)]", count, (double) count / num * 100);
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
