package phonebook;

import java.util.ArrayList;

public class PhoneBookList implements PhoneBook {
    ArrayList<Student> phoneBook;

    public PhoneBookList() {
        phoneBook = new ArrayList<Student>();
    }

    @Override
    public Student searchByLastname(String lastname) {
        for (Student i : phoneBook) {
            if (i.getLastname().equals(lastname)) {
                return i;
            }
        }
        return null;
    }

    @Override
    public Student searchByNumber(String number) {
        for (Student i : phoneBook) {
            if (i.getPhone().equals(number)) {
                return i;
            }
        }
        return null;
    }

    @Override
    public void addPerson(Student student) {
        phoneBook.add(student);
    }

    @Override
    public Student searchByName(String name) {
        for (Student i : phoneBook) {
            if (i.getName().equals(name)) {
                return i;
            }
        }
        return null;
    }

    @Override
    public void deleteByNumber(String number) {
        Student p = searchByNumber(number);
        if (p != null) {
            phoneBook.remove(p);
        }
    }
}
