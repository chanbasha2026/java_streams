package streams.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//given a person object where each person has a firstname and lastname.
//sort the list<Person> by their first name then by last name
public class SortPersonByFirstNameThenLastName {
    public static void main(String[] args) {

        List<Persn> persnList= Arrays.asList(
                new Persn("Booby","Smith"),
                new Persn("Booby","Adams"),
                new Persn("Jhon","Smith"),
                new Persn("Alice","Jhonson")

        );

        persnList.stream()
                .sorted(Comparator.comparing(Persn::getFirstName)
                        .thenComparing(Persn::getLastName))
                .toList().forEach(System.out::println);

    }
}
