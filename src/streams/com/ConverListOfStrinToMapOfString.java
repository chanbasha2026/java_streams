package streams.com;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

//given a list of string, return a map of the String and its length
public class ConverListOfStrinToMapOfString {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("orange","banana","kiwi","kiwi");

        fruits.stream()
                .collect(Collectors.toMap(Function.identity(),
                        String::length,
                        (existing,dupllicate)->existing
                ))
                .entrySet().forEach(System.out::println);
    }
}
