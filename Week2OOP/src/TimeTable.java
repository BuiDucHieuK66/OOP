package OOP.Week2;

import java.util.Scanner;

public class TimeTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size: ");
        int size = sc.nextInt();

        for (int row = -1; row <= size; row++) {
            if (row == -1)
                System.out.printf("%4s%4s", "*", "|");
            else if (row == 0)
                System.out.printf("%8s", "--------");
            else
                System.out.printf("%4d%4s", row, "|");
            for (int col = 1; col <= size; col++)
                if (row == -1)
                    System.out.printf("%4d", col);
                else if (row == 0)
                    System.out.printf("%4s", "----");
                else
                    System.out.printf("%4d", col * row);
            System.out.println();
        }      
        sc.close();
    }
}
