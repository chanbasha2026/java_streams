package streams.com;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

//by default streams we can not reuse but using supplier we can achive it
public class ReUseStreams {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Allice","Bob","Charlie","Anna");
        Stream<String> stream = names.stream();
        //consumption #1
        stream.forEach(System.out::println);
        //consumption #2  ERROR: IllegalStateException: stream has already been operated upon or closed
      /*  long count = stream.count();
        System.out.println(count);
        */
        System.out.println("----------------");
        Supplier<Stream<String>> stream1  = () -> names.stream();
        //consumption #1
        stream1.get().forEach(System.out::println);
        //consumption #2
        long count = stream1.get().count();
        System.out.println(count);

    }
}
