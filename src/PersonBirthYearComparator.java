import model.Person;

import java.util.Comparator;


public class PersonBirthYearComparator implements Comparable<person>{
    @Override
    public String toString(Person person1, Person person2) {
        return person1.getCountry() - person2.getCountry();

    }

}
