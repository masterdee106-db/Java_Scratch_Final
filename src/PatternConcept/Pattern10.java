package PatternConcept;

import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n=sc.nextInt();

        for (int i=1; i<=2*n-1; i++){
           int space, stars;
           if(i<=n){
               space=n-i;
               stars=i;
           }
           else {
               space=i-n;
               stars=2*n-i;
           }
            for (int j=1; j<=space; j++){
                System.out.print(" ");
            }

            for (int j=1; j<=stars; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
