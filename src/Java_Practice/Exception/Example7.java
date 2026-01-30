package Java_Practice.Exception;

public class Example7 {
    public static void main(String[] args) {
        try {
            int result = 10 / 2;
            System.out.println("Result: "+result);
        }
        catch (Exception e){
            System.out.println("Exception Caught...");
        }
        finally {
            System.out.println("Closing the resources...");
        }

    }
}
