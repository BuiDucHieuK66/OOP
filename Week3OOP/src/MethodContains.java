package OOP.Week3;

public class MethodContains {
    public static boolean contains (int[] array, int key) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == key)
                return true;
        }
        return false;
    }
}
