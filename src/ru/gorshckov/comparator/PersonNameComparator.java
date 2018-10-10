package ru.gorshckov.comparator;


public class PersonNameComparator extends PersonSuperComparator {
     @Override
     public int compare(Person a, Person b) {
         return a.getName().compareTo(b.getName());
     }
 }
