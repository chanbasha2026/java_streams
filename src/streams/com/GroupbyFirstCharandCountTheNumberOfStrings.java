package streams.com;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Given a list of Strings, group them by their first character and count
//the number of Strings in each group
public class GroupbyFirstCharandCountTheNumberOfStrings {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple","banana","apricot","cherry","blueberry","avocado");

        Map<Character, Long> collect = strings.stream().collect(Collectors.groupingBy(x->x.charAt(0), Collectors.counting()));
        System.out.println(collect);

    }

}
