package OOP.Week3;

public class MethodEquals {
    public static boolean equals(int[] array1, int[] array2) {
        for (int index = 0; index < array1.length; index++) {
            if (array1[index] != array2[index])
                return false;
        }
        return true;
    }
}
