package lessons.stream.ex01;



import lessons.stream.ex01.db.Storage;
import lessons.stream.ex01.model.Person;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author Serhii Klunniy
 */
public class Main {
    public static void main(String[] args) {
        List<Person> personList = Storage.getPersonList();

        List<Person> sortedPersonList = personList.stream()
                .sorted()
                .collect(Collectors.toList());
        sortedPersonList.forEach(System.out::println);

        System.out.println();

        Optional<Person> first = sortedPersonList.stream().
                filter(person -> person.getAge() > 30)
                .findFirst();

        first.ifPresent(System.out::println);

        long count = sortedPersonList.stream()
                .filter(person -> person.getAge() > 40)
                .count();

        System.out.println(count);


//        List<Person> newPersonList = sortedPersonList.stream()
//                .map(person -> new Person(person.getFirstName(), person.getLastName(), person.getAge() + 100))
//                .collect(Collectors.toList());
//        newPersonList.forEach(System.out::println);
//
//        System.out.println();

//        List<Integer> integerList = newPersonList.stream()
//                .map(Person::getAge)
//                .collect(Collectors.toList());
        //integerList.forEach(System.out::println);

//        List<Integer> collect = integerList.stream()
//                .sorted()
//                .collect(Collectors.toList());
//        collect.forEach(System.out::println);

//        for (int i = 0; i < personList.size(); i++) {
//            System.out.println(personList.get(i));
//        }

//        List<Person> personList1 = personList.stream()
//        .filter(person -> person.getAge() > 40)
//        .collect(Collectors.toList());
//        personList1.forEach(System.out::println);


    }
}
