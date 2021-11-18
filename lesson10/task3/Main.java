package task3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Person> personArrayList = new ArrayList<>();
        personArrayList.add(new Person(1,"Vova"));
        personArrayList.add(new Person(2, "Ann"));
        personArrayList.add(new Person(3, "Andrey"));
        personArrayList.add(new Person(4, "Maxim"));
        personArrayList.add(new Person(5, "Petr"));
        personArrayList.add(new Person(6, "Ann"));
        for (Person person : personArrayList) {
            System.out.println(person);
        }
        System.out.println("///////////////Change////////////////");
        personArrayList.set(1, new Person(2, "Inna"));
        for (Person person : personArrayList) {
            System.out.println(person);
        }
        System.out.println("///////////////Search person in ArrayList/////////////////");
        System.out.println("Person Аня");
        if (!personArrayList.contains(new Person(6, "Ann"))) {
            System.out.println("Is not on the list");
        } else {
            System.out.println("Is on the list");
        }
        System.out.println("Person Artem");
        if (!personArrayList.contains(new Person(7, "Artem"))) {
            System.out.println("Is not on the list");
        } else {
            System.out.println("Is on the list");
        }
        System.out.println("///////////////Delete last person/////////////////");
        personArrayList.remove(personArrayList.size()-1);
        for (Person person : personArrayList) {
            System.out.println(person);
        }
        System.out.println("///////////////Delete all person/////////////////");
        personArrayList.clear();
        System.out.println("Count person in ArrayList "+personArrayList.size());
        System.out.println("///////////////Deleted successfully/////////////////");
    }
}
