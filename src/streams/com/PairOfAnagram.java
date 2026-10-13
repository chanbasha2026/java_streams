package streams.com;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Group/pair anagrams from a list of Strings.For 1 word consider only 1 anagram
public class PairOfAnagram {
    public static void main(String[] args) {
        String[] s={"pat","tap","pan","nap","Team","tree","meat"};

        List<List<String>> list = Arrays.asList(s)
                .stream().collect(Collectors.groupingBy(
                        x -> Arrays.stream(x.toLowerCase().split("")).sorted()
                                .toList()
                )).entrySet().stream().map(x -> x.getValue()).toList();

        System.out.println(list);
        Collection<List<String>> values = Arrays.asList(s)
                .stream().collect(Collectors.groupingBy(
                        x -> Arrays.stream(x.toLowerCase().split("")).sorted()
                                .toList())).values();
        System.out.println(values);


    }
}
