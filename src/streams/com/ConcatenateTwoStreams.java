package streams.com;

import java.util.List;
import java.util.stream.Stream;

//concatenate 2 streams using stream api
public class ConcatenateTwoStreams {
    public static void main(String[] args) {
        Stream<String> s1 = Stream.of("Java","Python");
        Stream<String> s2 = Stream.of("C++","C#");
         Stream.concat(s1, s2).forEach(System.out::println);

    }
}
