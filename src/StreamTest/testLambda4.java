package StreamTest;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class testLambda4 {


    //内置的四大函数式接口
/*
    Comsumer<T>接口， 有泛型， 无返回值

    Supplier<T> 供给型接口

    Function<T, R> 函数式接口

    Predicate<T> 断言型接口

    */
    @Test
    public void test1(){
        happy(10000, money-> System.out.println("Spend "+money));

    }
    public void happy(double money, Consumer<Double> consumer){
        consumer.accept(money);
    }



    //Supplier interface, 产生一些数， 放入集合
    @Test

    public void test2(){
        List<Integer> list = getNumber(10, ()-> (int)(Math.random() *100));
        list.stream().sorted();
        for(Integer i : list){
            System.out.println(i);
        }
    }

    public List<Integer> getNumber(int num, Supplier<Integer> sup){
        List<Integer> list  = new ArrayList<>();
        for(int i = 0; i<num; i++){
            Integer n = sup.get();
            list.add(n);
        }
        return list;
    }

    //函数型接口

    @Test

    public void test3(){
        String strAfter = strHandler("\t\t\t I am Guodong Xue \t\t\t", str -> str.trim());
        System.out.println(strAfter);
    }
    public String strHandler(String str, Function<String, String> func){
        return func.apply(str);

    }

    //断言型接口， 进行判断操作
    @Test
    public void test4(){
        List<String> list = Arrays.asList("Hello", "atguigu" ,"morning");
        List<String> newStrList = filter(list, s -> s.length() > 3);
        for(String s: newStrList){
            System.out.println(s);
        }
    }

    public List<String> filter(List<String> list, Predicate<String> predicate){
        List<String> strList= new ArrayList<>();
        for(String s: list){
            if(predicate.test(s)){
                strList.add(s);
            }
        }
        return strList;
    }


}
