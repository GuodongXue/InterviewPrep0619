package StreamTest;

public class Employee {
    private String name;
    private int age;
    private double Salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        Salary = salary;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", Salary=" + Salary +
                '}';
    }
}
