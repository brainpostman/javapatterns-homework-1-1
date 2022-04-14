public class PersonBuilder {

    private String name = "";
    private String surname = "";
    private int age;
    private String address = "";

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age < 1) {
            throw new IllegalArgumentException("Некорректный возраст");
        }
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String city) {
        this.address = city;
        return this;
    }

    public Person build() {
        String exmes = "Человеку не присвоено:";
        if (name.isBlank()) {
            exmes += " Имя";
        }
        if (surname.isBlank()) {
            exmes += " Фамилия";
        }
        if (exmes.length() > 22) {
            throw new IllegalStateException(exmes);
        }
        return new Person(name, surname, age, address);
    }
}
