package OOP.Week2;

import java.util.Scanner;

public class ExchangeCipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a plaintext string: ");
        String str = sc.nextLine().toUpperCase();

        char[] arr = str.toCharArray();

        for (int i = 0; i < str.length(); i++) 
            System.out.print((char) (155 - arr[i]));
        sc.close();
    }
}
