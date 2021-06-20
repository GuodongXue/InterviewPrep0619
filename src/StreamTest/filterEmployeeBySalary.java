package StreamTest;

public class filterEmployeeBySalary implements MyPredicate<Employee>{

    @Override
    public boolean test(Employee t) {
        return t.getSalary()>=5000;
    }
}
