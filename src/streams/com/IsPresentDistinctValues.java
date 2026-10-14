package streams.com;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//in a given array of integers, return true if contains distinct values and false otherwise
public class IsPresentDistinctValues {
    public static void main(String[] args) {
        int[] arr ={5,0,1,0,8,0};

        boolean b = Arrays.stream(arr).boxed().toList()
                .stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .values().stream().noneMatch(x -> x > 1);
        System.out.println(b);


    }

}
