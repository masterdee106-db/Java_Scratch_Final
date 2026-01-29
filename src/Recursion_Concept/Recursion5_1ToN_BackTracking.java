package Recursion_Concept;

import java.util.Scanner;

public class Recursion5_1ToN_BackTracking {
    public static void print(int i, int n){
        if (i<1)
            return;
        print(i-1,n);
        System.out.println(i);
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();

        print(n,n);
    }
}
