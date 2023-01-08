package OOP.Week3;

import java.util.Scanner;

public class GradeStaticstics {
    public static void main(String[] args) {
        readGrades();

        System.out.println("The grades are: ");
        print(grades);

        System.out.println("The average is " + average(grades));
        System.out.println("The median is " + median(grades));
        System.out.println("The minimum is " + min(grades));
        System.out.println("The maximum is " + max(grades));
        System.out.println("The standard deviation is " + stdDev(grades));
    }

    public static int[] grades;

    public static void readGrades() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of student: ");
        int std = sc.nextInt();

        grades = new int[std];

        for (int i = 0; i < std; i++) {
            System.out.print("Enter the grade for student" + i + ":");
            grades[i] = sc.nextInt();
        }

        sc.close();

    }

    public static void print(int[] array) {
        System.out.print("The values are:: [");

        for (int i = 0; i < grades.length; i++) {
            if (i == 0) {
                System.out.print(grades[i]);
            } else {
                System.out.print(", " + grades[i]);
            }
        }

        System.out.println("]");
    }

    public static double average(int[] array) {
        int sum = 0;

        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }

        return (double) Math.round(sum / grades.length * 100.00) / 100.00;
    }

    public static int median(int[] array) {
        int temp;
        for (int i = 0; i < grades.length; i++) {
            boolean change = false;
            for (int j = 0; j < grades.length; j++) {
                if (grades[i] < grades[j]) {
                    temp = grades[i];
                    grades[i] = grades[j];
                    grades[j] = temp;
                    change = true;
                }
            }
            if (change == false)
                break;
        }

        if (grades.length % 2 == 1)
            return grades[grades.length / 2];
        else
            return (grades[grades.length / 2] + grades[grades.length / 2 + 1]) / 2;
    }

    public static int max(int[] array) {
        return grades[0];
    }

    public static int min(int[] array) {
        return grades[grades.length - 1];
    }

    public static double stdDev(int[] array) {
        double dev = 0;

        for (int i = 0; i < grades.length; i++) {
            dev += grades[i] * grades[i];
        } 
        dev = Math.sqrt(1 / dev - Math.pow(average(grades), 2));

        return dev;
    }
}
