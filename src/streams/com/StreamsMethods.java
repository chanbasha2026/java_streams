package streams.com;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsMethods {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ema","John","Amit","Karen","Ema");
        //#1 stream() : it convert a collection into a stream
        Stream<String> stream = names.stream();
        System.out.println(stream);
        //#2 filter(): filters based on predicate (boolean value)
        List<String> filterName = names.stream().filter(x -> x.startsWith("A")).toList();
        System.out.println(filterName);

        //#3 map() : transforms each element into another form
        List<Integer> nameLength = names.stream().map(String::length).toList();
        System.out.println(nameLength);

        //#4 flatMap(): flatterns nested structure into a single Stream

        List<List<String>> nameList = Arrays.asList(Arrays.asList("Ema","John","Amit","Karen"),
                Arrays.asList("Mike","Ham")
                );
        List<String> flatMapEx = nameList.stream().flatMap(Collection::stream).toList();
        System.out.println(flatMapEx);

        //#5 forEach(): performs an action an each element
       nameList.stream().flatMap(Collection::stream).forEach(System.out::println);

       //#6 collect(): collects the element into a collection
        Set<String> collect = names.stream().collect(Collectors.toSet());
        System.out.println(collect);
        //#7 sorted(): sorted elements in natural order

        List<String> sortedNames= names.stream().sorted().toList();
        System.out.println(names);

        //#8 limit(): limits the number of elements from the stream
        List<String> limitEx = names.stream().limit(2).toList();
        System.out.println(limitEx);

        //#9 distinct(): remove dublicates from the stream
        List<String> removeDublicates = names.stream().distinct().toList();
        System.out.println(removeDublicates);

        //#10 skip(): skip the fist n  elements from the stream
        List<String> skipEx = names.stream().skip(1).toList();
        System.out.println(skipEx);

        //#11 peek(): allowing inspection of each element in the stream
        List<String> peekNames = names.stream().peek(System.out::println).toList();

        //#12 count(): count the number of elements in the stream
        long count = names.stream().count();
        System.out.println(count);

        //#13 allMatch() return true if all match the predicate

        List<String> namesList = Arrays.asList("Ana","Alice","Amit","Alina");
        boolean b = namesList.stream().allMatch(x -> x.startsWith("A"));
        System.out.println(b);

        //#14 anyMatch(): it returns true if any element match the predicate;
        boolean anyMatch = namesList.stream().anyMatch(x -> x.startsWith("A"));
        System.out.println(anyMatch);

        //#15 noneMatch(): it return true if "none of the Element Match"
        boolean noneMatch = namesList.stream().noneMatch(x -> x.startsWith("A"));
        System.out.println(anyMatch);

        //#16 findFisrt(): returns the first element of the stream
        List<Integer> numList=Arrays.asList(1,2,3,4);
        List<String> nm =Arrays.asList("Harry","Ron","Hermoine");
        String firstName = nm.stream().findFirst().get();
        System.out.println(firstName);

        //#17 findAny(): returns any elements of the stream
        String anyName = nm.stream().findAny().get();
        System.out.println(anyName);

        //#18 max(): find the maximum Element according to a comparator

        Integer i = numList.stream().max(Integer::compareTo).get();
        System.out.println(i);

        //#19 min(): find the minimum element according to a comparator
        Integer mi = numList.stream().min(Integer::compareTo).get();
        System.out.println(mi);

        //#20 toArray(): converts the stream into array

        String[] array = names.stream().toArray(String[]::new);
        for (int j = 0; j <array.length ; j++) {
            System.out.println(array[j]);
        }

        //#21 generate(): create an infinite stream of elements
        Stream<Double> ran = Stream.generate(Math::random);
        ran.limit(5).forEach(System.out::println);

        //#22 iterate(): create infinite Stream by iteration over a function
        Stream<Integer> nums = Stream.iterate(0,n->n+2).limit(5);
        nums.forEach(System.out::println);

        //#23 of() creates a stream from a set of values
        Stream<String> a = Stream.of("A", "B", "C", "D");
        //System.out.println(a.toList());
        a.forEach(System.out::println);

        //#24 concat() concate two stream
        Stream<String> stream1 = Stream.of("A", "B", "C");
        Stream<String> strem2 = Stream.of("D", "E", "F");
        Stream<String> concat = Stream.concat(stream1, strem2);
        concat.forEach(System.out::println);

        //#25 reduce(): reduce the element to single value (it uses accumulator)

        int sum = numList.stream().reduce(0,Integer::sum);
        System.out.println(sum);


    }
}
