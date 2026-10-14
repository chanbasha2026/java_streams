package streams.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//write a program to move all zero's to beginning of array int[]
public class MovieAllZerosToBeginning {

    public static void main(String[] args) {
        int[] arr ={5,0,1,0,8,0};

        List<Integer> list = Arrays.stream(arr).boxed().toList();
        List<Integer> zeros = list.stream().filter(x -> x == 0).toList();
        List<Integer> nonzeros = list.stream().filter(x -> x != 0).toList();
        ArrayList<Object> finallist = new ArrayList<>();
        finallist.addAll(zeros);
        finallist.addAll(nonzeros);
        System.out.println(finallist);

        List<Integer> list2 = Stream.concat(zeros.stream(), nonzeros.stream()).toList();
        System.out.println(list2);


        List<Integer> list1 = Arrays.stream(arr).boxed().toList()
                .stream().collect(Collectors.partitioningBy(x -> x != 0))
                .values().stream().flatMap(x -> x.stream()).toList();
        System.out.println(list1);



        List<Integer> list3 = Arrays.stream(arr).boxed().toList()
                .stream().collect(Collectors.groupingBy(x -> x != 0))
                .values().stream().flatMap(x -> x.stream()).toList();
        System.out.println(list3);


    }
}
