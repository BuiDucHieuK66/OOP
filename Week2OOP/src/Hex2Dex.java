package OOP.Week2;

import java.util.Scanner;

public class Hex2Dex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Hexadecimal string: ");
        String hex = sc.nextLine();

        if (isHex(hex) == false)
            System.out.println("ERROR: invalid hexdecimal string \"" + hex +"\"");
        else {
            int dec = Integer.parseInt(hex, 16);
            System.out.println("The equivalent decimal number is: " + dec);
        }
        sc.close();
    }

    public static boolean isHex(String hex) {
        for (int i = 1; i < hex.length(); i++)
            if (!((hex.charAt(i) >= '0' && hex.charAt(i) <= '9') || (hex.charAt(i) >= 'A' && hex.charAt(i) <= 'F') || (hex.charAt(i) >= 'a' && hex.charAt(i) <= 'f'))) {
                return false;
            }
        return true;
    }
}
