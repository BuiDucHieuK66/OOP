import java.util.Scanner;

public class Dec2Hex {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a hexadecimal string: ");
        int dec = sc.nextInt();

        toHex(dec);
        
        sc.close();
    }

    public static void toHex (int dec) {
        StringBuilder reverseHex = new StringBuilder();
        do {
            if (dec % 16 < 10) {
                reverseHex.append(dec % 16);
            } else {
                reverseHex.append((char) ('A' + dec % 16));
            }
            dec = dec / 16;
        } while (dec != 0);

        System.out.print("The equivalent hexadecimal string is: ");
        for (int i = reverseHex.length() - 1; i >= 0; i--) {
            System.out.print(reverseHex.charAt(i));
        }
    }
}