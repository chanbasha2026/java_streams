package streams.com;
//given a list ofv employees with their names and departments names,
//write a Stream API solution to find the department that has Maximum Number of Employees

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindTheDepartmentHavingMaxNoOfEmp {

    public static void main(String[] args) {
        List<Emp> employees= Arrays.asList(
                new Emp("Alice","HR"),
                new Emp("Bob","IT"),
                new Emp("Charlie","IT"),
                new Emp("David","Finance"),
                new Emp("Eve","IT"),
                new Emp("Frank","HR"),
                new Emp("Grace","Finance"),
                new Emp("Hanna","IT")
        );
        Map<String, Long> collect = employees.stream().collect(
                Collectors.groupingBy(Emp::getDepartment, Collectors.counting())
        );
        System.out.println(collect);
        Map.Entry<String, Long> stringLongEntry = collect.entrySet().stream().max(Map.Entry.comparingByValue()).get();
        System.out.println(stringLongEntry.getKey()+":"+stringLongEntry.getValue());
    }
}
