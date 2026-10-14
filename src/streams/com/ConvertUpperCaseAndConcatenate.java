package streams.com;

import java.util.Arrays;
import java.util.List;

//given a list of strings convert all strings to uppercases and
//then concatenate them into a single string
public class ConvertUpperCaseAndConcatenate {
    public static void main(String[] args) {
        List<String> alph = Arrays.asList("a","b","c","d");
        String s3 = alph.stream().map(String::toUpperCase)
                .reduce((s1, s2) -> s1 + " " + s2)
                .orElse("");
        System.out.println(s3);
    }
}
