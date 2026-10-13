package streams.com;

import java.util.Arrays;

//Given a sentence find the words with a specified number of vowels
public class FindtheWordsSpecifiedNumberOfVowels {
    public static void main(String[] args) {

        String s ="I am learning Streams API in Java";
        int noOfVowels =2;
       Arrays.stream(s.split(" "))
               .filter(x->
                       x.replaceAll("[^aeiouAEIOU]","").length()==2)
               .forEach(System.out::println);

    }
}
