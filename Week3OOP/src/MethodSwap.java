package OOP.Week3;

public class MethodSwap {
    public static boolean swap(int[] array1, int[] array2) {
        if (array1.length == array2.length) {
            int temp;
            for (int index = 0; index < array1.length; index++) {
                temp = array1[index];
                array1[index] = array2[index];
                array2[index] = temp;
            }
            return true;
        }
        return false;
    }
}
