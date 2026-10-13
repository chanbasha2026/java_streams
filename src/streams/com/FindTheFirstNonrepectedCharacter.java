package streams.com;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//given a string find the first non-repeated character
public class FindTheFirstNonrepectedCharacter {
    public static void main(String[] args) {
        String s="Hello World";
        String s1 = Arrays.stream(s.split(""))
                .filter(c -> s.indexOf(c) == s.lastIndexOf(c))
                .findFirst().get();
        System.out.println(s1);

        Character c1 = s.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(x -> x.getValue() == 1).map(Map.Entry::getKey).findFirst().get();
        System.out.println(c1);
    }
}
