public class FactorialLong {
    public static void main(String[] args) {
        long factorial = 1;
        int n = 0;

        while (factorial > 0) {
            n++;
            factorial *= n;

            if (factorial > 0) {
                System.out.println("The factorial of " + n + " is " + factorial); 
            } else {
                System.out.println("The factorial of " + n + " is out of range");
            }
        }
    }
}