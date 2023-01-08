import java.util.Scanner;

public class PrintArrayInStar {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of items: ");
        final int NUM_ITEMS = sc.nextInt();

        int[] items = new int[NUM_ITEMS];

        System.out.print("Enter the value of all items: ");

        if (items.length > 0) {
            for (int i = 0; i < items.length; i++) {
                items[i] = sc.nextInt();
            }
        }

        for (int i : items) {
            for (int idx = 0; idx < i; idx++)
                System.out.print("#");
            System.out.println();
        }
        sc.close();
    }
}
