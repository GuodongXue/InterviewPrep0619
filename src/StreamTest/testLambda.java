package StreamTest;

import org.junit.Test;
import sun.reflect.generics.tree.Tree;

import java.util.*;

public class testLambda {

    @Test
    public void testInnerClass(){
        Comparator<Integer> comparator= new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1,o2);
            }
        };
        TreeSet<Integer> treeSet= new TreeSet<>(comparator);

    }

    //如果我们用lambda表达式呢
    @Test
    public void testLambda(){
        Comparator<Integer> comparator = (o1, o2) -> Integer.compare(o1, o2);
        TreeSet<Integer> ts  = new TreeSet<>(comparator);
    }



    List<Employee> employees = Arrays.asList(
            new Employee("a", 18, 2222.33),
            new Employee("a", 18, 2222.33),
            new Employee("b", 16, 23422.33),
            new Employee("n", 13, 2342.33),
            new Employee("e", 23, 22672.33),
            new Employee("e", 99, 22256.33),
            new Employee("t", 45, 222255.33),
            new Employee("y", 33, 222275.33),
            new Employee("r", 22, 534.33),
            new Employee("y", 66, 2256.33),
            new Employee("u", 55, 2265.33),
            new Employee("x", 65, 223455.33),
            new Employee("w", 19, 222788.33)

    );

    //来个需求， 比方说来filter一下年龄大于35的员工
    @Test
    public void test3(){
        List<Employee> afterFilter = filter(employees);
        for(Employee e : afterFilter){
            System.out.println(e);
        }
    }

    public List<Employee> filter(List<Employee> list){
        List<Employee> emps= new ArrayList<>();
        for(Employee e: list){
            if(e.getAge()>=35){
                emps.add(e);
            }
        }
        return emps;
    }

    public List<Employee> filter(List<Employee> list, MyPredicate<Employee> mp){
        List<Employee> emps = new ArrayList<>();
        for(Employee e: list){
            if(mp.test(e)){
                emps.add(e);
            }
        }
        return emps;
    }

    @Test
    public void test4(){
        List<Employee> list = filter(employees, new filterEmployeeByAge());
        for(Employee e: list){
            System.out.println(e);
        }
        System.out.println("------------------");
        List<Employee> list1 = filter(employees, new filterEmployeeBySalary());
        for(Employee e : list1){
            System.out.println(e);
        }
    }

    @Test
    public void test5(){
        List<Employee> list = filter(employees, new MyPredicate<Employee>() {
            @Override
            public boolean test(Employee employee) {
                return employee.getSalary()<=5000;
            }
        });

        for (Employee e : list){
            System.out.println(e);
        }
    }

    @Test
    public void  test6(){
        List<Employee> emps = filter(employees, (e) -> e.getSalary() <= 5000);
        emps.forEach(System.out::println);
    }

    @Test
    public void test7(){
        employees.stream()
                .filter((e) -> e.getSalary()>5000)
                //.limit(2)
                .forEach(System.out::println);

        employees.stream()
                .map(Employee::getName)
                .forEach(System.out::println);
    }

}
