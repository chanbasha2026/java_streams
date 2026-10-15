package streams.com;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//given a list of names,  find all the names that start with A
//and also print the count of names found
public class AvoidReUsingStreams {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ema","Bob","Alice","Anna");

        Stream<String> stringStream = names.stream().filter(x -> x.startsWith("A"));
        Stream<String> stringStream2 = names.stream().filter(x -> x.startsWith("A"));

        System.out.println(stringStream.toList());
        System.out.println(stringStream2.count());


    }
}
