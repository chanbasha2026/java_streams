package streams.com;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Given a String return the Character with the Maximum frequency in the String
public class StringReturnMaxFreqChar {
    public static void main(String[] args) {
        String s="javadeveloper";
        Character c1 = s.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()))
                .entrySet().stream().max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);
        System.out.println(c1);

    }
}
