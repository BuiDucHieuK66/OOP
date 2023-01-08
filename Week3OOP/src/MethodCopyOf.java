package OOP.Week3;

public class MethodCopyOf {
    public static int[] copyOf(int[] array) {
        int[] copy = new int[array.length];

        for (int index = 0; index < array.length; index++) {
            copy[index] = array[index];
        }
        return copy;
    }

    public static int[] copyOf2(int[] array, int newLength) {
        int[] copy = new int[newLength];

        for (int index = 0; index < newLength; index++) {
            if (index < array.length)
                copy[index] = array[index];
            else
                copy[index] = 0;
        }
        return copy;
    }
}
