package streams.com;

import java.util.Arrays;
import java.util.Comparator;

//given a sentence, find the word that has the 2nd(nth) highest length
public class Find2ndHigestLengthWord {
    public static void main(String[] args) {
        String s ="I am learning Streams API in Java";

        String s1 = Arrays.stream(s.split(" "))
                .sorted(Comparator.comparing(String::length).reversed())
                .skip(1).findFirst().get();
        System.out.println(s1);

    }
}
