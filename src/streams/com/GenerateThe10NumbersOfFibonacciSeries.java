package streams.com;

import java.util.List;
import java.util.stream.Stream;

//generate the first 10 numbers of the Fibonacci Sequence
public class GenerateThe10NumbersOfFibonacciSeries {
    public static void main(String[] args) {

        int a=0; int b=1;
        System.out.print(a+" ");
        for (int i = 1; i <10 ; i++) {
            System.out.print(b+" ");
            int sum =a+b;
            a=b;
            b=sum;
        }
        System.out.println();

        List<Integer> list = Stream.iterate(new int[]{0, 1},
                        f -> new int[]{f[1], f[0] + f[1]}).limit(10)
                .map(f -> f[0]).toList();
        System.out.print(list);
    }
}
