package streams.com;

import java.util.Arrays;
import java.util.List;

//find and print the distinct odd numbers
public class FindDistinctOddNumbers {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,8,9,9,10);

        List<Integer> list1 = list.stream().filter(x -> x % 2 != 0).distinct().toList();
        System.out.println(list1);
    }
}
