package streams.com;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//convert a list to a map given a person object list,
//convert it to a mpa with a keys as "City" and value as List<Person>
public class ConvertListToMap {
    public static void main(String[] args) {

        List<Person> persons = createPersonList();
        //System.out.println(persons);
        persons.stream().collect(Collectors.groupingBy(Person::getCity))
                .forEach((k,v)-> System.out.println(k+" "+v));

    }

    private static List<Person> createPersonList() {
        Person p1 =new Person("Amit",23,"Pune");
        Person p2 =new Person("Sumit",27,"Kolkata");
        Person p3 =new Person("Jatin",30,"Pune");
        Person p4 =new Person("Alex",22,"Pune");
        Person p5 =new Person("Payel",20,"Bengalore");
        List<Person> empList = new ArrayList<>();
        empList.add(p1);
        empList.add(p2);
        empList.add(p3);
        empList.add(p4);
        empList.add(p5);
        return empList;
    }

}
