package streams.com;

import java.util.Arrays;
import java.util.List;

//Given a person list fetch the list of names of a Person
//whose age is greater than 30
// -name should be unique
// -names hsould be sorted orders
public class FetchPersonDetailsWithConditions {
    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(
                new Person("Raj",39),
                new Person("Adhik",23),
                new Person("Raj",39),
                new Person("Krishna",36),
                new Person("zubin",32)
        );
        //Bad Practice
        List<String> list = personList.stream().filter(p -> p.getAge() > 30)
                .map(Person::getName)
                .distinct().sorted().toList();
        System.out.println(list);

        //good practice
        List<String> list1 = personList.stream().filter(p -> p.getAge() > 30)
                .map(Person::getName).toList();
        List<String> uniqueSortedList = list1.stream().distinct().sorted().toList();
        System.out.println(uniqueSortedList);
    }
}
