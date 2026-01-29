package BasicMathConcept;

import java.util.Scanner;

public class Extraction_Of_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n= sc.nextInt();

        int lastDigit;
        while (n>0){
             lastDigit=n%10;
            System.out.println(lastDigit);
            n=n/10;
        }
    }
}
