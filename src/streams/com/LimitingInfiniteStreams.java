package streams.com;

import java.util.stream.IntStream;
import java.util.stream.Stream;

//limiting infinite streams and method use case
public class LimitingInfiniteStreams {
    public static void main(String[] args) {
        Stream<Integer> infiniteStream =
                Stream.iterate(1, x -> x + 1);
        infiniteStream.limit(10).forEach(System.out::println);

        //use Primitives
        IntStream infiniteIntStream =
                IntStream.iterate(1, x -> x + 1);
        infiniteIntStream.limit(10).forEach(System.out::println);
        //incorrect usage
        Stream<Double> randomNumbers = Stream.iterate(Math.random(), n -> Math.random());
        randomNumbers.limit(10).forEach(System.out::println);
        System.out.println("----------");
        //correct usage
        Stream<Double> randomNum = Stream.generate(Math::random);
        randomNum.limit(10).forEach(System.out::println);

    }
}
