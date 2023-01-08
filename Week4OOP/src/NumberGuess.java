package OOP.Week4;

import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] arsg) {
        Scanner sc = new Scanner(System.in);
        
        int guess, count = 0;
        final int SECRET_NUMBER = (int) (Math.random() * 100);

        System.out.println("Key in your guess: ");

        do {
            guess = sc.nextInt();
            count++;

            if (guess < SECRET_NUMBER)
                System.out.println("Try higher");
            else if (guess > SECRET_NUMBER)
                System.out.println("Try lower");
            else
                System.out.println("You got it in " + count + " trials!");
        } while (guess != SECRET_NUMBER);

        sc.close();
    }
}
