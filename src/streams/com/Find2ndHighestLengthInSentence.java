package streams.com;

import java.util.Arrays;
import java.util.Comparator;

//find the 2nd highest length word in a sentence
public class Find2ndHighestLengthInSentence {

    public static void main(String[] args) {
        String s="I am learning Streams API in java";
        Integer length = Arrays.stream(s.split(" "))
                .map(String::length)
                .sorted(Comparator.reverseOrder())
                .skip(1).findFirst().get();
        System.out.println(length);
    }
}
