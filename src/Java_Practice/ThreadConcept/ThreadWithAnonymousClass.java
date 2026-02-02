package Java_Practice.ThreadConcept;

// thread implementation using anonymous class
public class ThreadWithAnonymousClass {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous Thread is Running....");
            }
        });
        thread.start();
    }
}
