package streams.com;

import java.util.Arrays;
import java.util.List;

//given a list of strings, create a list that contains only integer
public class FindStringContainsOnlyIntegers {
    public static void main(String[] args) {
        String[] s={"abc","123","456","xyz"};

        List<Integer> list = Arrays.stream(s)
                .filter(x -> x.matches("[0-9]+"))
                .map(Integer::valueOf)
                .toList();
        System.out.println(list);


    }
}
