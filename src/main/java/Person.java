import javax.swing.text.html.Option;
import java.util.OptionalInt;

public class Person {
    protected final String name;
    protected final String surname;
    protected int age;
    protected String address;

    public Person (String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person (String name, String surname, int age) {
        this(name, surname);
        this.age = age;
    }

    public Person (String name, String surname, int age, String city) {
        this(name, surname, age);
        address = city;
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder()
                .setSurname(this.surname)
                .setAddress(this.address)
                .setAge(1);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public OptionalInt getAge() {
        return OptionalInt.of(age);
    }

    public String getAddress() {
        return address;
    }

    public void happyBirthday() {
        age += 1;
    }

    public boolean hasAge() {
        return age != 0;
    }

    public boolean hasAddress()
    {
        return !address.isBlank();
    }

    public void setAddress(String city) {
        address = city;
    }
}
