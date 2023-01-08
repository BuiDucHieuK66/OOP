package OOP.Week3;

import java.util.Scanner;

public class MagicSum {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        final int SENTINEL = -1;
        int number;

        System.out.print("Enter a positive integer (or -1 to end): ");
        number = sc.nextInt();

        int sumEight = 0;

        while (number != SENTINEL) {
            if (hasEight(number) == true)
                sumEight += number;
            System.out.print("Enter a positive integer (or -1 to end): ");
            number = sc.nextInt();
        }
        System.out.println("The magic sum is: " + sumEight);

        sc.close();
    }

    public static boolean hasEight (int number) {
        while (number != 0) {
            if (number % 10 == 8)
                return true;
            number /= 10;
        }
        return false;
    }
}
