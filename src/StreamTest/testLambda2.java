package StreamTest;

import org.junit.Test;
import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.Comparator;
import java.util.function.Consumer;

//lambda的基本语法
public class testLambda2 {
    //先实验一个无参无返回值
    @Test
    public void test1(){

         final int number = 0; //jdk1.7以前必须是final

        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello world");
            }
        };
        r.run();
        System.out.println("--------------");
        Runnable r1 = ()-> System.out.println("Hello lambda");

        r1.run();
    }





    //实验有一个参无返回值
    @Test
    public void test2(){
        Consumer<String> con = x -> System.out.println(x);
        con.accept("chuangeshiyanzhi");
    }




    //实验有两个参， lambda 体中有多条语句小括号可以省略不写
    @Test
    public void test3(){
        Comparator<Integer> com = (o1, o2) -> {
            return Integer.compare(o1, o2);
        };

    }



    //实验有两个参， lambda 体中只有一条语句， 那么大括号和return都可以省略不写
    public void test4(){
        Comparator<Integer> com = (o1,o2) -> Integer.compare(o1,o2);
    }

    //不用写参数列表的数据类型， 是因为java的编译器可以通过上下文推断出

    @Test
    public void test6(){
        Integer num_res = operation(100, x -> x * x);
        System.out.println(num_res);
        System.out.println(operation(200, y-> y+200));

    }


    public Integer operation(Integer num, MyFunction mf){
        return mf.getValue(num);
    }

}
