package Recursion_Concept;

import java.util.Scanner;

public class Recursion3_Print_1ToN {

    public static void print_1ToN(int i, int n ){
        if (i>n)
            return;
            System.out.println(i);
            print_1ToN(i+1, n);

    }
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();

        print_1ToN(1,n);
    }
}
