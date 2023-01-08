package OOP.Week2;

import java.util.Scanner;

public class TestPalindromicWordAndPhrase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a word or phrase: ");
        String word = sc.nextLine().toLowerCase();

        int countChar = 0;

        for (int i = 0; i < word.length(); i++) 
            if (Character.isLetter(word.charAt(i)) == true) 
                countChar++;

        char[] arr = new char[countChar];
        int index = 0;
        for (int i = 0; i < word.length(); i++) 
            if (Character.isLetter(word.charAt(i)) == true) {
                arr[index] = word.charAt(i);
                index++;
            }

        System.out.println(isPalindrome(arr));
        
        sc.close();
    }

    public static boolean isPalindrome(char[] arr) {
        for (int i = 0; i < arr.length / 2 + 1; i++)
            if (arr[i] != arr[arr.length - 1 - i])
                return false;
        return true;
    }
}
