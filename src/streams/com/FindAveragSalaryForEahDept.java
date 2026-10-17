package streams.com;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//given a list of employee3s, where each employee has a name,department and salary.
//write a stream api solution to calculate the average salary for each department and display the result
public class FindAveragSalaryForEahDept {

    public static void main(String[] args) {
        List<Emp> employees= Arrays.asList(
                new Emp("Alice","HR",10000),
                new Emp("Bob","IT",25000),
                new Emp("Charlie","IT",35000),
                new Emp("David","Finance",45000),
                new Emp("Eve","IT",28000),
                new Emp("Frank","HR",50000),
                new Emp("Grace","Finance",20000),
                new Emp("Hanna","IT",15000)
        );

        Map<String, Double> collect = employees.stream().collect(Collectors.groupingBy(
                Emp::getDepartment, Collectors.averagingDouble(Emp::getSalary)));
        collect.entrySet().forEach(System.out::println);
    }
}
