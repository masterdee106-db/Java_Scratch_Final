package Java_Practice.FunctionalProgramming.FunctionalInterface;

import java.util.function.Consumer;

class Student{
    String name;
    int age;

    Student(String name, int age){
        this.name=name;
        this.age=age;
    }
}
public class ConsumerFunctionalInterface {
    public static void main(String[] args) {

        Student student = new Student("Munna", 30);
        Consumer<Student> printConsumerDetails = s-> System.out.println("name: "+s.name+" age: "+s.age);
        printConsumerDetails.accept(student);
    }
}
