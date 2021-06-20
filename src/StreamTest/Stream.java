package StreamTest;

import org.junit.Test;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Stream {
    private static List<Apple> appleStore = new ArrayList<>();
    static {
        appleStore.add(new Apple(1,"red", "ne", 300));
        appleStore.add(new Apple(2,"yellow", "ct", 200));
        appleStore.add(new Apple(3,"green", "mn", 300));
        appleStore.add(new Apple(4,"red", "mo", 330));
        appleStore.add(new Apple(5,"yellow", "ca", 800));
        appleStore.add(new Apple(6,"red", "ca", 400));
        appleStore.add(new Apple(7,"green", "ne", 500));
        appleStore.add(new Apple(8,"red", "nc", 600));
    }

    //找出红色的苹果
/*    public static void test1(List<Apple> appleStore){
        for(Apple a : appleStore){

            }
        }
    }*/
    /*public static List<Apple> test2(){
        List<Apple> redAppleList = appleStore
                .stream()
                .filter(apple -> apple.getColor().equals("red"))
                .filter(apple -> apple.getLocation().equals("ne"))
                .collect(Collectors.toList());
        return redAppleList;
    }*/
    //进行一个filter


    /*public void test3(*//*Predicate<? super Apple> predicate*//* ){
        List<Apple> apples = appleStore.stream().filter(pr).collect(Collectors.toList());

    }*/

    //进行一个统计
    @Test
    public  void test4(){
        Map<String, List<Apple>> map = new HashMap<>();
        for(Apple apple : appleStore){
            List<Apple> apples = map.computeIfAbsent(apple.getColor(), key -> new ArrayList<Apple>());
            apples.add(apple);

        }
        for(Map.Entry<String, List<Apple>> entry: map.entrySet()){
            int weights = 0;
            for (Apple apple : entry.getValue()){
                weights+= apple.getWeight();
            }
            System.out.println(weights / entry.getValue().size());
        }
    }

    @Test
    public void getByRead(){
        List result = new ArrayList();
        for(Apple apple: appleStore){
            if (apple.getColor().equals("red")){
                result.add(apple);
            }
        }
        System.out.println(result);
    }
@Test
    public void getByStream(){
        appleStore.stream()
                .filter(apple -> apple.getColor().equals("red"))
                .sorted()
                .distinct()
                .map(apple -> apple.getColor()).forEach(System.out::println);
    }


    /*public static void main(String[] args) {
       *//* List<Apple> apples = new ArrayList<>();
        System.out.println(test2().toString());;*//*
        test4();
*//*        System.out.println(new Stream().test3(apple -> apple.getColor().equals("red") && apple.getLocation().equals("ne")));*//*
    }*/
}
