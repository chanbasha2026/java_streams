package streams.com;

import java.util.Arrays;
import java.util.List;

//Find the Kth smallest element in a list of integers
public class FindKthSmallestElementInList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(7,1,6,2,1,3,4,5);
        int k=3;
        Integer i = list.stream().sorted().skip(k - 1).findFirst().get();
        System.out.println(i);

    }



}
