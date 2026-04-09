package java_hv_8.Set_Practice;

import java_hv_8.List_of_People.Person;

import java.util.HashSet;

public class Set {
    public static void main(String[] args) {
        Person p1 = new Person("Andriy", "Andriev", 25);
        Person p2 = new Person("Bohdan", "Bohdanov", 30);


        Person p3 = new Person("Andriy", "Andriev", 25);
        Person p4 = new Person("Bohdan", "Bohdanov", 30);

        java.util.Set<Person> people = new HashSet<>();

        System.out.println("Adding people to set");

        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);

        System.out.println("Set size (duplicates should not be added):");
        System.out.println(people.size());

        System.out.println("Set content:");
        System.out.println(people);

        System.out.println("Checking contains():");
        System.out.println(people.contains(p1));

        System.out.println("Removing element:");
        people.remove(p2);

        System.out.println("Set after remove:");
        System.out.println(people);

        System.out.println("Is set empty?");
        System.out.println(people.isEmpty());
    }
}
