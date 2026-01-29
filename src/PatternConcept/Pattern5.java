package PatternConcept;

import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n=sc.nextInt();

        for (int i=1; i<=n; i++){
            for (int j=0; j<n-i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
