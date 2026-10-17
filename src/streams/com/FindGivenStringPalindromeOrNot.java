package streams.com;

import java.util.stream.IntStream;

//given string palindrome or not
public class FindGivenStringPalindromeOrNot {
    public static void main(String[] args) {
        String s="level".toLowerCase();
        boolean b = IntStream.range(0, s.length() / 2)
                .allMatch(x -> s.charAt(x) == s.charAt(s.length() - x-1));
        System.out.println(b);


    }
}
