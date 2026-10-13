package streams.com;

import java.util.Arrays;

//find the product of the first two elements an array
public class ProductOfTheFirstTwoElements {


    public static void main(String[] args) {
        int[] arr ={12,5,6,9,2,4};
        Integer reduce = Arrays.stream(arr).boxed().toList()
                .stream().limit(2)
                .reduce(1, (a, b) -> a * b);
        System.out.println(reduce);

    }

}
