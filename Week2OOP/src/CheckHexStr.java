package OOP.Week2;

import java.util.Scanner;

public class CheckHexStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a hex string: ");
        String hex = sc.nextLine();

        char[] arr = hex.toCharArray();

        System.out.println(isHexStr(arr));

        sc.close();
    }

    public static boolean isHexStr(char[] arr) {
        for (int index : arr)
            if (!((index >= '0' && index <= '9') || (index >= 'A' && index <= 'F') || (index >= 'a' && index <= 'f'))) {
                return false;
            }
        return true;
    }
}
