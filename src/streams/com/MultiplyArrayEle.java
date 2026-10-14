package streams.com;

import java.util.Arrays;
import java.util.List;

//Multiply array elements
public class MultiplyArrayEle {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5};

        Integer i = Arrays.asList(arr).stream()
                .reduce((x, y) -> x * y).get();
        System.out.println(i);

    }
}
