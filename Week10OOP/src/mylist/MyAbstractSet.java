package mylist;

public abstract class MyAbstractSet implements MySet {
    final int INITIAL_SIZE = 16;
    Object[] table;
    int size;

    public MyAbstractSet() {
        this.table = new Object[INITIAL_SIZE];
        this.size = 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Object[] array = toArray();
        for (Object o : array) {
            sb.append(String.format("[%s]", o));
        }
        return sb.toString();
    }

    @Override
    public int size() {
        return this.size;
    }

    public String showBuckets() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < table.length; i++) {
            if (table[i] == null) {
                sb.append(String.format("[bucket %d] -> null\n", i));
            } else {
                sb.append(String.format("[bucket %d] -> %s\n", i, table[i]));
            }
        }
        return sb.toString();
    }

    public void enlarge() {
        Object[] tmp = new Object[table.length * 2];
        System.arraycopy(table, 0, tmp, 0, table.length);
        table = tmp;
    }

    public double capacityRatio() {
        return size / (double) table.length;
    }

    abstract Object[] toArray();
}
