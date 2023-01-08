package mylist;

public interface MyCollection {
    boolean contains(Object o);
    void remove(Object o);
    void add(Object o);
    int size();
}
