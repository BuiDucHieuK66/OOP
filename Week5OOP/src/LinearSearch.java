import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.print("Enter the number you want to search: ");
        final int key = sc.nextInt();

        if (linearSearch(array, key) != -1) {
            System.out.println(linearSearch(array, key));
        } else {
            System.out.println("not found");
        }
        sc.close();
    }

    public static int linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (key == array[i]) {
                return i;
            }
        }
        return -1;
    }
}
