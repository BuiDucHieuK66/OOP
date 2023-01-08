public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {9, 2, 4, 1, 5};

        bubbleSort(array);

        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static void bubbleSort(int[] array) {
        int temp;
        boolean isSwap;

        for (int i = 0; i < array.length - 1; i++) {
            isSwap = false;
            for (int swap = 0; swap < array.length - 1; swap++) {
                if (array[swap] > array[swap + 1]) {
                    isSwap = true;
                    temp = array[swap];
                    array[swap] = array[swap + 1];
                    array[swap + 1] = temp;
                }
            }
            if (isSwap == false) {
                break;
            }
        }
    }
}
