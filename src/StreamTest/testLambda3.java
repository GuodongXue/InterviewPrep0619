package StreamTest;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;

public class testLambda3 {
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

    @Test
    public void test(){

        Collections.sort(employees, (e1, e2)->{
            if(e1.getAge() == e2.getAge()){
                return e1.getName().compareTo(e2.getName());
            }else {
                return -Integer.compare(e1.getAge(), e2.getAge());
            }
        });
        for(Employee e: employees){
            System.out.println(e);
        }

    }


    //用于处理字符串的方法

    @Test
    public void test2(){
        String trimStr = strHandler("\t\t\tabdsdsd", str -> str.toUpperCase());

        String trimStr1 = strHandler("\t\t\tabdsdsd", str -> str.substring(5,9));
        System.out.println(trimStr);
        System.out.println(trimStr1);
    }

    public String strHandler(String str, MyFunction2 mf){
        return mf.getValue(str);
    }


    //对两个long型进行处理
    @Test

    public void test3(){
        operation2(100L, 200L, (x,y) -> x+y);
        operation2(100L, 200L, (x, y) ->x*y);
    }
    public void operation2(Long l1, Long l2, MyFunction3<Long, Long> mf){
        System.out.println(mf.getValue(l1, l2));

    }
}
