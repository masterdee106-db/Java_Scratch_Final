package Recursion_Concept;

public class BasicRecursionExample {
    static int count=0;
    public static void function(){
        if (count==3)
            return;
        System.out.println(count);
        count++;
        function();
    }
    public static void main(String[] args) {
        function();
    }
}
