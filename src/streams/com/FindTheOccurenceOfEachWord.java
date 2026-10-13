package streams.com;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//given a sentence , find the occurrence of each word
public class FindTheOccurenceOfEachWord {
    public static void main(String[] args) {
        String s="I am learning Streams API in JAVA JAVA";

        Map<String, Long> collect = Arrays.stream(s.split(" "))
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        System.out.println(collect);

        Map<String, Long> collect1 = Arrays.stream(s.split(" "))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect1);


    }

}
