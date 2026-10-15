package streams.com;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//given an Employee object, print the Average of the age of male and female Employee
public class FindAverageAgeOfMaleAndFeMaleEmployees {
    public static void main(String[] args) {
    Employee e1 = new Employee("Anil","anil@gmail.com",24,"M");
        Employee e2 = new Employee("Bob","bob@gmail.com",35,"M");
        Employee e3 = new Employee("Cindy","cindy@gmail.com",33,"F");
        Employee e4 = new Employee("Diana","diana@gmail.com",45,"F");
        List<Employee> list = Arrays.asList(e1,e2,e3,e4);


        System.out.println(
                list.stream()
                        .collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge)))
        );

    }
}
