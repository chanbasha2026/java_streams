package streams.com;

import java.util.Arrays;
import java.util.List;

//difference between map and flatmap
public class MapVsFlatMap {

    public static void main(String[] args) {
        List<Product> products = Arrays.asList(new Product("MacBook", Arrays.asList("red", "blue")),
                new Product("iphone", Arrays.asList("green", "silver", "pink")),
                new Product("iwatch", Arrays.asList("black", "brown"))
        );

        List<List<String>> list = products.stream().map(Product::getColor).toList();
        System.out.println(list);

        List<String> list1 = products.stream().flatMap(x -> x.getColor().stream()).toList();
        System.out.println(list1);

    }
}
