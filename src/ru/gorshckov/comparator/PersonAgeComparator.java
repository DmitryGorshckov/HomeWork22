package ru.gorshckov.comparator;



public class PersonAgeComparator extends PersonSuperComparator {
    @Override
    public int compare(Person a, Person b) {
        if (a.getAge() > b.getAge())
            return 1;
        else if (a.getAge() < b.getAge())
            return -1;
        else
            return 0;
    }
}
