package streams.com;

public  class Employe {
    int empId;
    String empName;

    public Employe(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                '}';
    }
}