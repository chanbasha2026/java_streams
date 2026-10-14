package streams.com;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Stream;

//remove all non-numeric characters from a list
public class RemoveNonNumericCharactersFromList {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a1b2c3","1a2b3c","123abc");

        Pattern pattern = Pattern.compile("[^0-9]");
        List<String> list1 = list.stream().map(x -> pattern.matcher(x).replaceAll("")).toList();
        System.out.println(list1);
    }
}
