package streams.com;

public class Empl {
    private double salary;
    private String name;

    public Empl(double salary, String name) {
        this.salary = salary;
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Empl{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                '}';
    }
}
