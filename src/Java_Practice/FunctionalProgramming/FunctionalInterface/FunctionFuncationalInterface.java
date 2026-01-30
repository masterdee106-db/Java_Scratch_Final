package Java_Practice.FunctionalProgramming.FunctionalInterface;

import java.util.function.Function;

class God{
    String godName;
    String godPlace;

    God(String name, String place){
        this.godName=name;
        this.godPlace=place;
    }
}
public class FunctionFuncationalInterface {
    public static void main(String[] args) {


        Function<String, Integer> nameLength=name->name.length();
        System.out.println(nameLength.apply("Mahadev"));
    }
}
