package streams.com;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Given a list of integers, divide it into two lists one having
// an even number and the other having an odd number
public class DivideIntoTwoListHavingOddandEven {

    public static void main(String[] args) {

        int[] arr ={1,2,3,4,5,6,7,8};

        List<List<Integer>> list = Arrays.stream(arr).boxed().toList()
                .stream()
                .collect(Collectors.groupingBy(x -> x % 2 == 0, Collectors.toList()))
                .entrySet().stream().map(x -> x.getValue())
                .toList();
        System.out.println(list);


        List<List<Integer>> list1 = Arrays.stream(arr).boxed().toList()
                .stream().collect(Collectors.partitioningBy(x -> x % 2 == 0, Collectors.toList()))
                .entrySet().stream().map(Map.Entry::getValue).toList();
        System.out.println(list1);


    }
}
