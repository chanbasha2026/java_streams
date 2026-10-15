package streams.com;

import java.util.stream.IntStream;

//print the middle character of the String
public class PrintMiddleCharOfTheString {
    public static void main(String[] args) {
        String s="education";
        int len=s.length();
        int mid =len/2;
        String midChar = IntStream.range(0, len)
                .filter(x -> len % 2 == 0 ? (x == mid || x == mid - 1) : x == mid)
                .mapToObj(s::charAt)
                .collect(StringBuilder::new, StringBuilder::append,
                        StringBuilder::append).toString();
        System.out.println(midChar);


    }

}
