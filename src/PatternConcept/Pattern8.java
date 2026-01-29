package PatternConcept;

import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n=sc.nextInt();

        for (int i=0; i<n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        for (int i=0; i<n; i++){
            for (int k=0; k<=i; k++){
                System.out.print(" ");
            }
            for (int k=0; k<2*n-(2*i+1); k++){
                System.out.print("*");
            }
            for (int k=0; k<=i; k++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
