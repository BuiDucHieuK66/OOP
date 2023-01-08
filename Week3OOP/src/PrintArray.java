package OOP.Week3;

import java.util.Scanner;

public class PrintArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int NUM_ITEMS;
        int[] items;

        System.out.print("Enter the number of items: ");
        NUM_ITEMS = sc.nextInt();

        items = new int[NUM_ITEMS];

        System.out.print("Enter the value of all items: ");
        if (items.length > 0) {
            for (int i = 0; i < items.length; i++) {
                items[i] = sc.nextInt();
            }
        }

        System.out.print("The values are:: [");

        for (int i = 0; i < items.length; i++) {
            if (i == 0) {
                System.out.print(items[i]);
            } else {
                System.out.print(", " + items[i]);
            }
        }

        System.out.println("]");

        sc.close();
    }
}