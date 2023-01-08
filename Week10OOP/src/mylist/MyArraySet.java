package mylist;

public class MyArraySet extends MyAbstractSet{
    public MyArraySet() {
        super();
    }

    @Override
    Object[] toArray() {
        return table;
    }

    @Override
    public void add(Object o) {
        if (capacityRatio() >= 0.6) {
            enlarge();
        }
        if (!contains(o)) {
            table[size++] = o;
        }
    }

    @Override
    public boolean contains(Object o) {
        int index = getIndex(o);
        return index != -1;
    }

    @Override
    public void remove(Object o) {
        int index = getIndex(o);
        if (index == -1) {
            return;
        }
        System.arraycopy(table, index + 1, table, index, size - index);
        table[--size] = null;
    }

    public int getIndex(Object o) {
        for (int i = 0; i < size; i++) {
            if (table[i].hashCode() == o.hashCode()) {
                return i;
            }
        }
        return -1;
    }
}
