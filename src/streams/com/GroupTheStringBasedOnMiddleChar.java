package streams.com;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//given the String[] group the strings based on the middle character
public class GroupTheStringBasedOnMiddleChar {

    public static void main(String[] args) {
        String[] str ={"ewe","jji","jhj","kwk","aha"};

        Map<String, List<String>> collect = Arrays.stream(str).toList()
                .stream().collect(Collectors.groupingBy(
                        x -> x.toString().substring(1, 2)
                ));
        System.out.println(collect);


        Map<String, List<String>> collect1 = Stream.of(str).toList()
                .stream().collect(Collectors.groupingBy(x -> x.toString().substring(1, 2)));
        System.out.println(collect1);


    }
}
