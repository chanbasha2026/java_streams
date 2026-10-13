package streams.com;

import java.util.stream.IntStream;

//write a Stream program to multiply alternative numbers in an array
public class MultiplyAlternativesNumbersInArray {
    public static void main(String[] args) {
        int[] arr ={4,5,1,7,2,9,2};
        int reduce = IntStream.range(0, arr.length)
                .filter(x -> x % 2 == 0)
                .map(x -> arr[x])
                .reduce(1, (a, b) -> a * b);
        System.out.println(reduce);

        int reduce1 = IntStream.range(0, arr.length)
                .filter(x -> x % 2 != 0)
                .map(x -> arr[x])
                .reduce(1, (a, b) -> a * b);
        System.out.println(reduce1);

    }
}
