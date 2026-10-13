package streams.com;

import java.util.Arrays;
import java.util.Comparator;

//Given a sentence, find the word that has the higest lenght
public class HigestLenghtWordInSentence {

    public static void main(String[] args) {
        String s="I am learning Streams API in Java";
        String s1 = Arrays.stream(s.split(" "))
                .max(Comparator.comparing(String::length))
                .get();
        System.out.println(s1);

        String s2 = Arrays.stream(s.split(" "))
                .min(Comparator.comparing(String::length))
                .get();
        System.out.println(s2);


    }
}
