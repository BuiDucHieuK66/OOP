package OOP.Week3;

public class MethodArrayToString {
    public static String arrayToString(int[] array) {
        String str = "[";
        for (int i = 0; i < array.length; i++) {
            if (i == 0)
                str += Integer.toString(array[i]);
            else   
                str += ", " + Integer.toString(array[i]);
        }
        str += "]";

        return str;
    }
}
