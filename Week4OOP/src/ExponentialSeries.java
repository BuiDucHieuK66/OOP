import java.util.Scanner;

public class ExponentialSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x: ");
        double x = sc.nextDouble();

        System.out.println("Enter the number of terms: ");
        int numTerms = sc.nextInt();

        System.out.println(specialSeries(x, numTerms));

        sc.close();
    }

    public static double specialSeries(double x, int numTerms) {
        double sum = 0, term1, term2 = 1;
        int n = 0, count = 0;

        while (count != numTerms) {
            n++;
            term1 = Math.pow(x, n) / n;

            if (n % 2 == 1) {
                sum += term1 * term2;
                count++;
                term2 *= n;
            } else {
                term2 /= n;
            }
        }
        return sum;
    }
}