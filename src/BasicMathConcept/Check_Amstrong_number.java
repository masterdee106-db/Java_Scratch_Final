package BasicMathConcept;

import java.util.Scanner;

public class Check_Amstrong_number {
    public static void main(String[] args) {

        // For amstrong number if the sum of 3 of all the digit becomes equals to the left hand side number then it will be called as amstrong number...

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int lastDigit;
        int sum=0;
        int duplicate=num;
        while (num>0){

            lastDigit=num%10;
            sum=sum+(lastDigit*lastDigit*lastDigit);
            num=num/10;
        }
        System.out.println(sum);
     if (sum==duplicate){
         System.out.println("its a AMSTRONG number");
     }
     else {
         System.out.println("Not Amstrong...");
     }
    }
}
