import java.util.Scanner;

public class PerfectNDeficientNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int amount = 0;

        System.out.print("Enter the upper bound: ");
        int num = sc.nextInt();

        System.out.println("These munber are perfect: ");
        for (int i = 1; i < num; i++) {
            if(isPerfect(i)) {
                System.out.printf("%-4d", i);
                amount++;
            }
        }
        System.out.printf("\n[%d perfect numbers found (%,.2f%%)]\n\n", amount, (double) amount / num * 100);

        System.out.println("These numbers are neither deficient nor perfect: ");

        amount = 0;

        for (int i = 1; i < num; i++) {
            if (isDeficient(i) == false && isPerfect(i) == false) {
                System.out.printf("%-4d", i);
                amount++;
            }
        }
        System.out.printf("\n[%d numbers found (%,.2f%%)]", amount, (double) amount / num * 100);
    }

    public static boolean isPerfect(int aPosInt) {
        int sum = 0;

        for (int i = 1; i < aPosInt; i++) {
            if (aPosInt % i == 0) {
                sum += i;
            }
        }
        if (sum == aPosInt) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isDeficient(int aPosInt) {
        int sum = 0;

        for (int i = 1; i < aPosInt; i++) {
            if (aPosInt % i == 0) {
                sum += i;
            }
        }
        if (sum < aPosInt) {
            return true;
        } else {
            return false;
        }
    }
}
