package Recursion_Concept;

import java.util.Scanner;

public class Recursion4_Print_NTo1 {
    public static void printNTo1(int n, int i){
        if (n<i)
            return;
        System.out.println(n);
        printNTo1(n-1, i);
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();

        printNTo1(n, 1);
    }
}
