import java.util.Scanner;

public class TrigonometricSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("sin(x) && cos(x)");

        System.out.print("Enter the radian x: ");
        double x = sc.nextDouble();

        System.out.print("Enter the number of terms: ");
        int numTerms = sc.nextInt();

        System.out.println("sin(x) = " + sin(x, numTerms));
        System.out.println("cos(x) = " + cos(x, numTerms));

        sc.close();
    }
    
    public static double sin(double x, int numTerms) {
        double sin = 0, term = 1;
        int n = 0, count = 0;

        while (count != numTerms) {
            n++;
            term *= x / n;

            if (n % 4 == 1) {
                sin += term;
            } else if (n % 4 == 3) {
                sin -= term;
            }
            count++;
        }
        return sin;
    }

    public static double cos(double x, int numTerms) {
        double cos = 1, term = 1;
        int n = 0, count = 0;

        while (count != numTerms) {
            n++;
            term *= x / n;

            if (n % 4 == 0) {
                cos += term;
                count++;
            } else if (n % 4 == 2) {
                cos -= term;
                count++;
            }
        }
        return cos;
    }
}