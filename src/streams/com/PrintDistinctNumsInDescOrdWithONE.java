package streams.com;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//print all the distinct numbers in descending order which starts with '1'
public class PrintDistinctNumsInDescOrdWithONE {
    public static void main(String[] args) {
        int[] arr={12,34,11,34,67,121,52,78,114,565,1643,11};

        Arrays.stream(arr).distinct()
                .filter(x->String.valueOf(x).startsWith("1"))
                .boxed()
                .sorted((a,b)->b-a)
                .toList().forEach(System.out::println);

    }
}
