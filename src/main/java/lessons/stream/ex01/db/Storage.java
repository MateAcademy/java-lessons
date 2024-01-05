package lessons.stream.ex01.db;


import lessons.stream.ex01.model.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Serhii Klunniy
 */
public class Storage {
    private static final List<Person> persons = new ArrayList<>();

    static {
        Person person1 = new Person("Иван", "Иванов", 33);
        Person person2 = new Person("Петр", "Петров", 28);
        Person person3 = new Person("Сидор", "Сидоров", 39);
        Person person4 = new Person("Иван", "Тургенев", 46);
        Person person5 = new Person("Лев", "Толстой", 48);
        Person person6 = new Person("Антон", "Чехов", 32);
        Person person7 = new Person("Афанасий", "Фет", 20);
        Person person8 = new Person("Алексей", "Толстой", 41);
        Person person9 = new Person("Владимир", "Маяковский", 23);
        Person person10 = new Person("Михаил", "лермонтов", 26);

        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
        persons.add(person5);
        persons.add(person6);
        persons.add(person7);
        persons.add(person8);
        persons.add(person9);
        persons.add(person10);
    }

    public static List<Person> getPersons() {
        return persons;
    }
}
