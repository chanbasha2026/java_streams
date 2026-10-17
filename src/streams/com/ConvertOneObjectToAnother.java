package streams.com;

import java.util.List;

//Transform Employee Object into EmployeeDto
public class ConvertOneObjectToAnother {

    public static void main(String[] args) {
        List<Employe> employees =
                List.of(new Employe(1, "Alice"),
                        new Employe(2, "Bob"));

        List<EmployeDto> list = employees.stream()
                .map(e -> new EmployeDto(e.empId, e.empName))
                .toList();

        System.out.println(list);
    }
}
