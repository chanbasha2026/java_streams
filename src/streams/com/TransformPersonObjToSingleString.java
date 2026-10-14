package streams.com;
//transform Person Object stream into a single string containing of all names in Upper Letters separated by "|"(pipe) character

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TransformPersonObjToSingleString {
    public static void main(String[] args) {
        List<Person> person = Arrays.asList(new Person("Max",18),
                new Person("Peter",23),
                new Person("Pamela",24),
                new Person("David",28),
                new Person("Dan",30)
                );

        Collector<Person, StringJoiner,String> personStringJoinerStringCollector=
                Collector.of(
                        ()->new StringJoiner(" | "),
                        (j,p)->j.add(p.getName().toUpperCase()),
                        StringJoiner::merge,
                        StringJoiner::toString
                );
        String collect = person.stream().collect(personStringJoinerStringCollector);
        System.out.println(collect);
        //second method

        String result = person.stream()
                .map(p -> p.getName().toUpperCase())
                .collect(Collectors.joining(" | "));

        System.out.println(result);
    }
}
