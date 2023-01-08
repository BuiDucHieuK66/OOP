package OOP.Week2;

import java.util.Scanner;

public class BoxPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size: ");
        int size = sc.nextInt();

        box4(size);

        sc.close();
    }

    public static void box1(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++)
                if (row == 1 || row == size || col == 1 || col == size)
                    System.out.print("# ");
                else
                    System.out.print("  ");               
            System.out.println();
        }
    }

    public static void box2(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++)
                if (row == 1 || row == size || row == col)
                    System.out.print("# ");
                else
                    System.out.print("  ");               
            System.out.println();
        }
    }

    public static void box3(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++)
                if (row == 1 || row == size || row + col == size + 1)
                    System.out.print("# ");
                else
                    System.out.print("  ");               
            System.out.println();
        }
    }

    public static void box4(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++)
                if (row == 1 || row == size || row == col || row + col == size + 1)
                    System.out.print("# ");
                else
                    System.out.print("  ");               
            System.out.println();
        }
    }
}