package streams.com;

import java.util.stream.IntStream;

//write a stream program to multiply 1st and last element,
//2nd and 2nd last element etc numbers in an array
public class MultiplyFirstLastSecondSecondLastEle {

    public static void main(String[] args) {

        int[] arr ={4,5,1,7,2,9};

        IntStream.range(0,arr.length/2)
                .map(x->arr[x]*arr[arr.length-x-1])
                .forEach(System.out::println);

    }
}
