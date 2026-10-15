package streams.com;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//given a product class with attributes : id(int),name(String),
//price(double)and category(String). create a list of products
//and implement the following functionalites :
//1) print the names of products whose price is below a certain thereshold (eg 100)
//2) create a new list containing products with a price reduction of 20%
//3)Calculate the average price of all products
//4)Find the product with the lowest price using Stream API
public class ImplementsFilter_reduction_etc {

    public static void main(String[] args) {
        Product p1 =new Product(1,"Lifeboy",20,"Soap");
        Product p2 =new Product(2,"Portonics",200,"Adapter");
        Product p3 =new Product(3,"SurExcel",90,"Washing Powder");
        Product p4 =new Product(4,"Yamaha",8000,"Guitar");
        Product p5 =new Product(5,"Ikigal",500,"Book");

        List<Product> productList = Arrays.asList(p1,p2,p3,p4,p5);

        //#1
        List<String> listOfProductNames = productList.stream().filter(x -> x.getPrice() < 100)
                .map(Product::getName).toList();
        System.out.println(listOfProductNames);
        System.out.println();

        //#2
        List<Product> reducePrice = productList.stream().map(
                product -> {
                    double discountedPrice = product.getPrice() * 0.80;
                    product.setPrice(discountedPrice);
                    return product;
                }
        ).toList();
        System.out.println(reducePrice);

        //#3

        double asDouble = productList.stream().mapToDouble(Product::getPrice).average().getAsDouble();
        System.out.println(asDouble);

        //#$
        Product product =
                productList.stream().min((x1, x2) -> Double.compare(x1.getPrice(), x2.getPrice())).get();
        System.out.println(product);

    }
}
