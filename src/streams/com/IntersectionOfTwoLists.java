package streams.com;

import java.util.Arrays;
import java.util.List;

//find the intersection of two lists using java streams
public class IntersectionOfTwoLists {


    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1,2,3,4,5);
        List<Integer> list2 = Arrays.asList(3,5,6,7);
        List<Integer> list = list1.stream().filter(list2::contains).toList();
        System.out.println(list);
    }

}
