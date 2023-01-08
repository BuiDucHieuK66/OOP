package OOP.Week2;

import java.util.Scanner;

public class Bin2Dec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Binary string: ");
        String bin = sc.nextLine();

        if (isBin(bin) == false)
            System.out.println("ERROR: invalid binary string \"" + bin +"\"");
        else {
            int dec = Integer.parseInt(bin, 2);
            System.out.println("The equivalent decimal number is: " + dec);
        }
        sc.close();
    }

    public static boolean isBin(String bin) {
        for (int index = 0; index < bin.length(); index++)
            if (bin.charAt(index) != '0' && bin.charAt(index) != '1')
                return false;
        return true;
    }
}
