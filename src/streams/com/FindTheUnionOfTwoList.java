package streams.com;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

//Find the union of two lists of integers
public class FindTheUnionOfTwoList {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1,2,3,4,5);
        List<Integer> list2 = Arrays.asList(6,7,8,9,10);

        List<Integer> list = Stream.concat(
                list1.stream(),
                list2.stream()
        ).toList();
        System.out.println(list);
    }
}
