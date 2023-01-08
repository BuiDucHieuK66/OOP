package OOP.Week2;

import java.util.Scanner;

public class Oct2Dec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an Octal string: ");
        String oct = sc.nextLine();

        if (isOct(oct) == false)
            System.out.println("ERROR: invalid octdecimal string \"" + oct +"\"");
        else {
            int dec = Integer.parseInt(oct, 8);
            System.out.println("The equivalent decimal number is: " + dec);
        }
        sc.close();
    }

    public static boolean isOct(String oct) {
        for (int i = 1; i < oct.length(); i++)
            if (!(oct.charAt(i) >= '0' && oct.charAt(i) <= '7')) {
                return false;
            }
        return true;
    }
}
