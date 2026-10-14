package streams.com;

import java.util.Arrays;
import java.util.List;

//convert a list of Strings to upperCase
public class ConvertListOfStringToUpperCase {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("breaking bed","game of thrones","big bang theory");

        List<String> list1 = list.stream().map(x -> x.toUpperCase()).toList();

        List<String> list2 = list.stream().map(String::toUpperCase).toList();

        System.out.println(list1);
        System.out.println(list2);
    }
}
