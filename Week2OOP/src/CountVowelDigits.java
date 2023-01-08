package OOP.Week2;

import java.util.Scanner;

public class CountVowelDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        str.toLowerCase();
        char[] arr = str.toCharArray();

        double proVowel = Math.round((double) countVowels(arr) / str.length() * 10000.00) / 100.00;
        double proDigit = Math.round((double) countDigits(arr) / str.length() * 10000.00) / 100.00;

        System.out.printf("Number of vowels: %d (%s%%)\n", countVowels(arr), String.valueOf(proVowel));
        System.out.printf("Number of digits: %d (%s%%)\n", countDigits(arr), String.valueOf(proDigit));

        sc.close();
    }

    public static int countVowels(char[] arr) {
        int countVowel = 0;

        for (char i : arr)
            if (i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u')
                countVowel++;
        return countVowel;
    }

    public static int countDigits(char[] arr) {
        int countDigit = 0;

        for (char i : arr)
            if (i >= '0' && i <= '9')
                countDigit++;
        return countDigit;
    }
}
