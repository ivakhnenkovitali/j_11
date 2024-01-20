import model.Person;
import model.PersonCountryComparator;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Integer[] are1 = {3, -5, 0, 10, 4};
        System.out.println(Arrays.toString(are1));
        Arrays.sort(are1);
        System.out.println(Arrays.toString(are1));

        String[] arr2 = {"Gosha", "Artem", "ignat", "Zhora", "Miya"};
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));

        Person[] people = {
                new Person("Gosha", "Russia", 1970),
                new Person("Zhora","Belarus", 1965),
                new Person("Gosha", "Belarus",1960),
                new Person("Artem","Russia", 1990),
                new Person("Gosha","Russia", 1967)
        };


        Arrays.sort(people);


        for (Person person : people) {
            System.out.println(person);
        }

        System.out.println("----------------");
        ///сортикровка по годам рождения
        PersonBirthYearComparator pbc = PersonBirthYearComparator();
        Arrays.sort(people,pbc);
        for (Person person : people){
            System.out.println(person);
        }


        System.out.println("------------------");
        Arrays.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person1, Person2) {
                return person1.getNeme().compareToIgnoreCse(person2.getName());
            }

        });
    }


}



