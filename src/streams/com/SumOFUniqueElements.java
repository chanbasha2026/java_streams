package streams.com;

//given an array find the sum of unique elements

import java.util.Arrays;
import java.util.stream.Collectors;

public class SumOFUniqueElements {

    public static void main(String[] args) {
        int[] arr ={1,6,7,8,1,1,8,8,7};

        int sum = Arrays.stream(arr).distinct().sum();
        System.out.println(sum);

    }
}
