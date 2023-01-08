package mymap;

public interface MyMap {
    public abstract int size();
    public abstract void put(Object key, Object value);
    public abstract void remove(Object o);
    public abstract boolean contains(Object o);
    public abstract Object get(Object o);

    public abstract String toString();
}
