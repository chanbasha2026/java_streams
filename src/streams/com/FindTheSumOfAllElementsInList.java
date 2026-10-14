package streams.com;

import java.util.Arrays;
import java.util.List;

//find the sum of all the elements in a list
public class FindTheSumOfAllElementsInList {

    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1,2,3,4,5);
        int sum = num.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);

    }
}
