package Java_Practice.ThreadConcept;

// Creating Thread by Implementing Runnable Interface...
class MyTask implements  Runnable{
    private String name;
    MyTask(String name){
        this.name=name;
    }

    // This is the code executed by the thread
    public void run(){
        for (int i=1; i<=5; i++){
            System.out.println(name+" is running: "+i);

        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e) {
            System.out.println(name + " was interrupted");

        }
        }
    }
}

public class ThreadWithRunnableInterface {
    public static void main(String[] args) {

        // Step1: Creating runnable tasks
        MyTask task1= new MyTask("Thread-A");
        MyTask task2 = new MyTask("Thread-B");

        // Step2: Creating the Thread Object and passing the tasks
        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);

        // Step3: Starts the Thread
        t1.start();
        t2.start();

        //Main Thread continues Independently
        System.out.println("Main Thread is Running...");


    }
}
