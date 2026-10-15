package streams.com;

import java.util.Objects;

public class Employee {
    private String name;
    private String email;
    private int age;
    private String gender;

    public Employee(String name, String email, int age, String gender) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.gender = gender;
    }


    public Employee(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
