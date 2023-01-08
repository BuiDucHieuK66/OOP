package OOP.Week2;

import java.util.Scanner;

public class HillPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size: ");
        int size = sc.nextInt();

        hillD(size);

        sc.close();
    }

    public static void hillA(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size * 2 - 1; col++) {
                if (row + col > size && row > col - size)
                    System.out.print("# ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static void hillB(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size * 2 - 1; col++) {
                if (row + col <= size * 2 && row <= col)
                    System.out.print("# ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static void hillC(int size) {
        for (int row = 1; row <= size * 2 - 1; row++) {
            for (int col = 1; col <= size * 2 - 1; col++) {
                if (row + col > size && row > col - size && row + col <= size * 3 - 1 && row - size <= col - 1)
                    System.out.print("# ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static void hillD(int size) {
        for (int row = 1; row <= size * 2 - 1; row++) {
            for (int col = 1; col <= size * 2 - 1; col++) {
                if (row + col <= size + 1 || size - 1 <= col - row || row + col >= size * 3 - 1 || size - 1 <= row - col)
                    System.out.print("# ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
