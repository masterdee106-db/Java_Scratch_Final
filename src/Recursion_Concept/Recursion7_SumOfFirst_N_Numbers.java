package Recursion_Concept;

import java.util.Scanner;
//
//public class Recursion7_SumOfFirst_N_Numbers {
//    static int sum=0;
//
//    public static void printSum(int i,int n){
//        if (i>n)
//            return;
//        sum=sum+i;
//        printSum(i+1,n);
//
//    }
//    public static void main(String[] args) {
//        Scanner sc =  new Scanner(System.in);
//        System.out.println("Enter the number: ");
//        int n=sc.nextInt();
//
//        printSum(0,n);
//    }
//}
public class Recursion7_SumOfFirst_N_Numbers {
    public static void printSum(int i, int sum){
        if (i<1){
            System.out.println(sum);
            return;
        }
        printSum(i-1, sum+i);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int i= sc.nextInt();

        printSum(i,0);
    }
}