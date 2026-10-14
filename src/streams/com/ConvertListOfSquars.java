package streams.com;

import java.util.Arrays;
import java.util.List;

//convert a list of integers to a list of their squares.
public class ConvertListOfSquars {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);

        List<Integer> list1 = list.stream().map(x -> x * x).toList();
        System.out.println(list1);
    }
}
