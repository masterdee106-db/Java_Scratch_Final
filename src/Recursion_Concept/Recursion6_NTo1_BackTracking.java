package Recursion_Concept;

import java.util.Scanner;

public class Recursion6_NTo1_BackTracking {
    public static void print(int i, int n){
        if(i>n)
            return;
        print(i+1, n);
        System.out.println(i);
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        print(1,n);
    }
}
