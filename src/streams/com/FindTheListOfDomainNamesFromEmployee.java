package streams.com;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//there is a list of Employee Object having field name and email
//find the list of domains(gmail.com,yahoo.com etc) and the occurrences of each domain
public class FindTheListOfDomainNamesFromEmployee {
    public static void main(String[] args) {

        Employee e1 = new Employee("sam","sam@gmail.com");
        Employee e2 = new Employee("Adam","adam@yahoo.com");
        Employee e3 = new Employee("peter","peter@gmail.com");

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        System.out.println(employeeList);

        Map<String, Long> collect = employeeList.stream().map(x -> x.getEmail().substring(x.getEmail().indexOf("@")))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);
    }
}
