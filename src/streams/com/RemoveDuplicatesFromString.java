package streams.com;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;

//remove duplicates from the string and return in the same order
public class RemoveDuplicatesFromString {

    public static void main(String[] args) {
        String s = "dabcadefg";
        //method 1
        Arrays.stream(s.split(""))
                .distinct()
                .forEach(System.out::print);
        System.out.println();
        //method 2
        s.chars().distinct()
                .mapToObj(x->(char)x)
                .forEach(System.out::print);

    }
}
