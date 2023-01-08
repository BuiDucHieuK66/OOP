package OOP.Week3;

import java.util.Scanner;

public class GradesStatistics {
    public  static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of students: ");
        int totalStd = sc.nextInt();

        int[] students = new int[totalStd];

        for (int std = 0; std < students.length; std++) {
            System.out.print("Enter the grade for student 1: ");
            students[std] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < students.length; i++)
            sum += students[i];

        System.out.println("The average is: " + (double) Math.round(sum / students.length * 100.00) / 100.00);

        int max = students[0];
        int min = students[0];
        
        for (int i = 0; i < students.length; i++) {
            if (max < students[i])
                max = students[i];
            if (min > students[i])
                min = students[i];
        }

        System.out.println("The maximum is: " + max);
        System.out.println("The minimum is: " + min);

        sc.close();
    }
}
