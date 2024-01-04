package lessons.stream.ex01.db;


import lessons.stream.ex01.model.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Serhii Klunniy
 */
public class Storage {
    private static List<Person> personList = new ArrayList<>();

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

        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);
        personList.add(person5);
        personList.add(person6);
        personList.add(person7);
        personList.add(person8);
        personList.add(person9);
        personList.add(person10);
    }

    public static List<Person> getPersonList() {
        return personList;
    }
}
