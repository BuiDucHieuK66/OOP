package phonebook;

public interface PhoneBook {
    Student searchByLastname(String lastname);
    Student searchByNumber(String number);
    void addPerson(Student student);
    Student searchByName(String name);
    void deleteByNumber(String number);
}
