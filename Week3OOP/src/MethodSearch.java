package OOP.Week3;

public class MethodSearch {
    public static int search(int[] array, int key) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == key)
                return index;
        }
        return -1;
    }
}
