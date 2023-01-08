package OOP.Week3;

import java.util.Scanner;

public class MethodExponent {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base: ");
        int base = sc.nextInt();

        System.out.print("Enter the exponent: ");
        int exp = sc.nextInt();

        System.out.println(base + " raises to the power of " + exp + " is: " + exponent(base, exp));

        sc.close();
    }
    public static int exponent (int base, int exp) {
        int sol = 1;
        for (int i = 0; i < exp; i++) {
            sol *= base;
        }
        return sol;
    }
}
