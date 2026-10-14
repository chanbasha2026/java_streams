package streams.com;

import java.util.Arrays;
import java.util.List;

//calculate the average of all the numbers
public class AverageOfAllEle {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        double asDouble = list.stream().mapToDouble(Integer::doubleValue).average()
                .getAsDouble();
        System.out.println(asDouble);
    }
}
