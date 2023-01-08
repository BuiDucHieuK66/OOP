package OOP.Week4;

import java.util.Scanner;

public class NumberConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        String in = sc.nextLine();

        System.out.println("Enter the input radix: ");
        int inRadix = sc.nextInt();

        System.out.println("Enter the output radix: ");
        int outRadix = sc.nextInt();

        System.out.println(in + " in radix " + inRadix + " is " + toRadix(in, inRadix, outRadix) + " in radix " + outRadix);

        sc.close();
    }

    public static String toRadix(String in, int inRadix, int outRadix) {
        try {
            int dec = Integer.parseInt(in, inRadix);

            StringBuilder reverseStr = new StringBuilder();
            int residual;

            while (dec != 0) {
                residual = dec % outRadix;

                if (residual < 10) {
                    reverseStr.append(residual);
                } else {
                    reverseStr.append((char) ('A' + residual % 10));
                }
                dec /= outRadix;
            }
            StringBuilder Str = new StringBuilder();

            for (int i = reverseStr.length() - 1; i >= 0; i--) {
                Str.append(reverseStr.charAt(i));
            }

            return Str.toString();
        } catch (NumberFormatException e) {
            return "ERROR";
        }
    }
}
