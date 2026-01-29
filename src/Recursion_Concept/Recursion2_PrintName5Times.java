package Recursion_Concept;
//
//public class Recursion2_PrintName5Times {
//    static int count=0;
//    public static void printName(){
//        if (count==5)
//            return;
//        System.out.println("Deepan");
//        count++;
//        printName();
//    }
//    public static void main(String[] args) {
//        printName();
//    }
//}

import java.util.Scanner;

public class Recursion2_PrintName5Times {
    public static void printName(int i, int n){
        if (i>n)
            return;
            System.out.println("Deepan");
            printName(i+1,n);
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();

        printName(1,n);

    }
}