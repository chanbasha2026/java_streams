package streams.com;
//given an int[] array, re-arrange the elements to form
// the highest/lowest possible value

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class ReArrangeArrayHigstorLowestPossibleValues {

    public static void main(String[] args) {

        int[] arr ={1,2,3,4,5};

        Arrays.stream(arr).mapToObj(x->x).sorted()
                .forEach(System.out::print);
        System.out.println();
        Arrays.stream(arr).boxed().sorted(Collections.reverseOrder())
                .forEach(System.out::print);

    }


}
