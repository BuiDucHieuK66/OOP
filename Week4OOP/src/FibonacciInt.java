public class FibonacciInt {
    public static void main(String[] args) {
        int num = 1, fibonacci = 0;

        while (fibonacci >= 0) {  
            fibonacci = fibIndex(num);
            
            if (fibonacci > 0) {
                System.out.println("The factorial of " + num + " is " + fibonacci); 
            } else {
                System.out.println("The factorial of " + num + " is out of range");
            }
            num++;
        }
    }

    public static int fibIndex(int num) {
        int fib1 = 1, fib2 = 1;
        for (int i = 1; i <= num; i++) {
            if (fib1 >= fib2) {
                fib2 += fib1;
            } else {
                fib1 += fib2;
            }
        }
        if ((fib1 >= fib2 && fib2 > 0)) {
            return fib1;
        } else if (fib2 >= fib1 && fib1 > 0) {
            return fib2;
        } else {
            return -1;
        }
    }
}