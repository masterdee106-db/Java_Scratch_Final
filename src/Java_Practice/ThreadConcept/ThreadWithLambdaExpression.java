package Java_Practice.ThreadConcept;

public class ThreadWithLambdaExpression {
    public static void main(String[] args) {
        Thread thread = new Thread(()->{
            System.out.println("Thread Created using Lambda Expression...");
        });
        thread.start();
    }
}
