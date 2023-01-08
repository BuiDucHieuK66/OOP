public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {9, 6, 5, 4, 3, 2, 1};

        insertionSort(array);

        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static void insertionSort(int[] array) {
        int temp;

        for (int index = 1; index < array.length; index++) {
            for (int indexChange = index; indexChange > 0; indexChange--) {
                if (array[indexChange] < array[indexChange - 1]) {
                    temp = array[indexChange];
                    array[indexChange] = array[indexChange - 1];
                    array[indexChange - 1] = temp;
                }
            }
        }
    }
}
