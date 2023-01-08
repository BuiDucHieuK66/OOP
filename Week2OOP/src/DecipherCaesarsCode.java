package OOP.Week2;

import java.util.Scanner;

public class DecipherCaesarsCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a ciphertext string: ");
        String str = sc.nextLine().toUpperCase();
        
        char[] arr = str.toCharArray();

        for (int i = 0; i < str.length(); i++) {
            int newChar = arr[i] - 3;

            if (newChar < 65)
                System.out.print((char) (newChar + 26));
            else
                System.out.print((char) newChar);
        }
        sc.close();
    }
}
