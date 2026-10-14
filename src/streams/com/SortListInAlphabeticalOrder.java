package streams.com;

import java.util.Arrays;
import java.util.List;

//Sort a list of Strings in alphabetical order
public class SortListInAlphabeticalOrder {

    public static void main(String[] args) {
        List<String> str = Arrays.asList("Zudio","Puma","Addidas","MAC","H&M");

        List<String> list = str.stream().sorted().toList();
        System.out.println(list);
    }
}
