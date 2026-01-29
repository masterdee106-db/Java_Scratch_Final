package BasicMathConcept;

import java.util.Scanner;

public class Count_Number_Of_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n= sc.nextInt();
        int count=0;
        int lastDigit;
        while (n>0){
            lastDigit=n%10;
            count=count+1;
            n=n/10;

        }
        System.out.println(count);
    }
}
