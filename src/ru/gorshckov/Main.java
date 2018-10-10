package ru.gorshckov;
import ru.gorshckov.comparator.Person;
import ru.gorshckov.comparator.PersonAgeComparator;
import ru.gorshckov.comparator.PersonNameComparator;
import java.util.*;

public class Main {

    public static void main(String[] args) {
            List<Person> list = createExamplePersons();
            System.out.printf("before sort: %s%n", list);
            System.out.println("========");
            Collections.sort(list, new PersonNameComparator());
        // Collections.sort(list, Comparator.comparing(Person::getAge)
                   // .thenComparing(Person::getName));
            System.out.printf("after sort name: %s%n", list);
            System.out.println("========");
            Collections.sort(list, new PersonAgeComparator());
            System.out.printf("after sort age: %s%n", list);
}



    private static List<Person> createExamplePersons() {
        return Arrays.asList(
                new Person("Tommy", 15),
                new Person("Sara", 24),
                new Person("Ann", 9));

}
}
