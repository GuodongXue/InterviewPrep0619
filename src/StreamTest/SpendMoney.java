package StreamTest;


import java.util.function.Consumer;

class Test{
        public static void buySomething(double money, Consumer s){
            s.accept(money);
        }

        public static void main(String[] args) {
            /*buySomething(4000, new Consumer<Double> () {
                @Override
                public void accept(Double money) {
                    System.out.println("Why you spend "+ money+" ?");
                }
            });*/

            buySomething(4000, money -> System.out.println("Why you spend "+ money+" ?"));
        }
    }


