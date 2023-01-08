package phonebook;

import java.util.HashMap;

public class PhoneBookMap implements PhoneBook {
    HashMap<String, Student> phoneBook;

    public PhoneBookMap() {
        phoneBook = new HashMap<String, Student>();
    }

    @Override
    public Student searchByLastname(String lastname) {
        for (Student s : phoneBook.values()) {
            if (s.getLastname().equals(lastname)) {
                return s;
            }
        }
        return null;
    }

    @Override
    public Student searchByNumber(String number) {
        if (phoneBook.containsKey(number)) {
            return phoneBook.get(number);
        }
        return null;
    }

    @Override
    public void addPerson(Student student) {
        phoneBook.put(student.getPhone(), student);
    }

    @Override
    public Student searchByName(String name) {
        for (Student s : phoneBook.values()) {
            if (s.getName().equals(name)) {
                return s;
            }
        }
        return null;
    }

    @Override
    public void deleteByNumber(String number) {
        phoneBook.remove(number);
    }
}
