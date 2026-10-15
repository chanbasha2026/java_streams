package streams.com;

import java.util.Arrays;
import java.util.List;

//print all Employees with salary greater than 20000 and increase their salary by 1000
public class PrintEmployeesSalaryGre2000IncrBy1000 {
    public static void main(String[] args) {
        List<Empl> emplList = Arrays.asList(new Empl(45000,"Anil"),
                new Empl(10000,"Sunil"),
                new Empl(60000,"Punit")
                );
        emplList.stream().filter(x->x.getSalary()>20000)
                .peek(x->x.setSalary(x.getSalary()+1000))
                .toList().forEach(System.out::println);

    }
}
