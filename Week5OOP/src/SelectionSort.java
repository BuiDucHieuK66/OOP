public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {9, 6, 4, 1, 5};

        selectionSort(array);
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static void selectionSort(int[] array) {
        int temp, min, minIndex = 0;

        for (int index = 0; index < array.length; index++) {
            min = Integer.MAX_VALUE;

            for  (int findMin = index; findMin < array.length; findMin++) {
                if (min > array[findMin]) {
                    min = array[findMin];
                    minIndex = findMin;
                }
            }
            temp = array[index];
            array[index] = array[minIndex];
            array[minIndex] = temp;
        }
    }
}
