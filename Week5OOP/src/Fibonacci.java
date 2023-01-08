import java.util.Scanner;

public class Fibonacci {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         System.out.print("What number do you want to display? ");
         int n = sc.nextInt();

         System.out.print(fib(n));
     }

     public static int fib(int n) {
         if (n == 0) {
             return 0;
         } else if (n == 1) {
             return 1;
         } else return fib(n - 1) + fib(n - 2);
     }
}
