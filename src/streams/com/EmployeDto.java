package streams.com;

public class EmployeDto {
    private int empId;
    private String empName;

    public EmployeDto(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    @Override
    public String toString() {
        return "EmployeDto{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                '}';
    }
}
