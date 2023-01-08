package exercises;

import java.util.*;

public class Sets {
    public static Set<Integer> intersectionManual(Set<Integer> first, Set<Integer> second) {
        Set<Integer> intersection = new HashSet<Integer>();
        for (int i : first) {
            if (second.contains(i)) {
                intersection.add(i);
            }
        }

        return intersection;
    }

    public static Set<Integer> unionManual(Set<Integer> first, Set<Integer> second) {
        Set<Integer> union = new HashSet<Integer>();
        union.addAll(first);
        union.addAll(second);

        return union;
    }

    public static List<Integer> toList(Set<Integer> source) {
        List<Integer> list = new ArrayList<Integer>();
        list.addAll(source);

        return list;
    }

    public static List<Integer> removeDuplicates(List<Integer> source) {
        Set<Integer> set = new HashSet<Integer>();
        set.addAll(source);
        source.clear();
        source.addAll(set);

        return source;
    }

    public static List<Integer> removeDuplicatesManual(List<Integer> source) {
        List<Integer> noDuplicate = new LinkedList<Integer>();
        for (int i : source) {
            if (!noDuplicate.contains(i)) {
                noDuplicate.add(i);
            }
        }

        source.clear();
        source.addAll(noDuplicate);
        return source;
    }

    public static String firstRecurringCharacter(String s) {
        ArrayList<Character> list = new ArrayList<Character>();
        char now;
        for (char i : s.toCharArray()) {
            list.add(i);
        }

        for (int i = 0; i < s.length(); i++) {
            now = list.remove(0);
            if (list.contains(now)) {
                return Character.toString(now);
            }
        }

        return null;
    }

    public static Set<Character> allRecurringChars(String s) {
        Set<Character> recurringChar = new HashSet<Character>();
        ArrayList<Character> list = new ArrayList<Character>();
        char now;
        for (char i : s.toCharArray()) {
            list.add(i);
        }

        for (int i = 0; i < s.length(); i++) {
            now = list.remove(0);
            if (list.contains(now)) {
                recurringChar.add(now);
                list.remove(Character.toString(now));
            }
        }

        return recurringChar;
    }

    public static Integer[] toArray(Set<Integer> source) {
        return source.toArray(new Integer[0]);
    }

    public static int getFirst(TreeSet<Integer> source) {
        return source.first();
    }

    public static int getLast(TreeSet<Integer> source) {
        return source.last();
    }

    public static int getGreater(TreeSet<Integer> source, int value) {
        return source.higher(value);
    }
}
