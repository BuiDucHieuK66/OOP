package OOP.Week2;

import java.util.Scanner;

public class CaesarsCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a plaintext string: ");
        String str = sc.nextLine().toUpperCase();

        char[] arr = str.toCharArray();

        for (int i = 0; i < str.length(); i++) {
            int newChar = arr[i] + 3;

            if (newChar > 90)
                System.out.print((char) (newChar - 26));
            else
                System.out.print((char) newChar);
        }
        sc.close();
    }
}
