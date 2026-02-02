package Java_Practice.ThreadConcept;

class MyTasks implements Runnable{
    private String name;
     MyTasks(String name){this.name=name;}
    public void run(){
        for (int i=1; i<=5; i++){
            System.out.println(name+" is running "+i);
            try{
                Thread.sleep(2000);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
public class MultiThreadingDemo {
    public static void main(String[] args) {
        Thread thread1= new Thread(new MyTasks("Thread-A"));
        Thread thread2 = new Thread(new MyTasks("Thread-B"));

        thread1.start();
        thread2.start();

        System.out.println("Continuing Main Thread....");
    }
}
