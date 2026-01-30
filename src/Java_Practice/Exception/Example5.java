package Java_Practice.Exception;

public class Example5 {
    static void checkAge(int age){
        if (age<18) {
            throw new IllegalArgumentException("Age must be more than 18");
        }
            System.out.println("You are eligible to vote...");

    }

    public static void main(String[] args) {
//        checkAge(16);
        checkAge(19);
    }
}
