package streams.com;

import java.util.stream.IntStream;

//given a string print the count of a particular substring
public class PrintCountOfPaticularSubString {
    public static void main(String[] args) {
        String s="xoxoBridegxoxoxo!"; // find count of bye

        String check="xo";

        long count = IntStream.range(0, s.length() - 1)
                .filter(x -> s.substring(x, x + 2).equals(check))
                .count();
        System.out.println(count);

    }
}
