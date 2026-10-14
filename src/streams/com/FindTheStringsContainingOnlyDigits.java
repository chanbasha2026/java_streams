package streams.com;

import java.util.Arrays;
import java.util.List;

//find and print the strings containing only digits
public class FindTheStringsContainingOnlyDigits {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("123","abc","123abc","45");
        List<String> list1 = list.stream().filter(x -> x.matches("\\d+")).toList();
        System.out.println(list1);

        List<String> list2 = list.stream().filter(x -> x.matches("[0-9]+")).toList();
        System.out.println(list2);

    }
}
