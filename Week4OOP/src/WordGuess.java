package OOP.Week4;

import java.util.Scanner;

public class WordGuess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        final String word = "testing";

        String guess;
        boolean[] place = new boolean[word.length()];
        String[] words = new String[word.length()];
        int count = 0;

        System.out.println("Chiec non ki dieu");

        do {
            count++;

            System.out.print("Key in one character or your guess word: ");
            guess = sc.next();

            if (guess.length() > 1) {
                if (guess.equals(word)) {
                    System.out.println("Congratulation!");
                    System.out.println("You got it in " + count + " trials");
                } else {
                    System.out.println("Game over");
                }
            } else {
                isRightPlace(place, word, guess);

                System.out.print("Trial " + count + ": ");
            
                print(place, guess, words);
            }
        } while (!(guess.equals(word)));

        sc.close();
    }

    public static boolean[] isRightPlace(boolean[] place, String word, String guess) {
        for (int i = 0; i < word.length(); i++) {
            if (word.substring(i, i + 1).equals(guess)) {
                place[i] = true;
            } else {
                place[i] = false;
            }
        }
        return place;
    }

    public static void print(boolean[] place, String guess, String[] words) {
        for (int i = 0; i < words.length; i++) {
            if (place[i] == true) {
                words[i] = guess;
            }
            if (words[i] == null) {
                System.out.print("-");
            } else {
                System.out.print(words[i]);
            }
        }
        System.out.println();
    }
}
