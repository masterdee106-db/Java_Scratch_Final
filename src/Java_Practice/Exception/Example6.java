package Java_Practice.Exception;

public class Example6 {
    public static void main(String[] args) {
        try{
            int result = 10/0;
            System.out.println("Result: "+result);
        }
        catch (ArithmeticException e){
            System.out.println("Arithmatic Exception Caught...");
        }
        finally {
            System.out.println("Finally block executed...");
        }
    }
}
