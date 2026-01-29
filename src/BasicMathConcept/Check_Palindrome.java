package BasicMathConcept;

import java.util.Scanner;

public class Check_Palindrome {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number: ");
            int n= sc.nextInt();
            int reverseNumber=0;
            int lastDigit;
            int duplicate=n;
            while (n>0){
                lastDigit=n%10;
                reverseNumber=(reverseNumber*10)+lastDigit;
                n=n/10;
            }
            System.out.println(reverseNumber);
            if (reverseNumber==duplicate){
                System.out.println("its Palindrome");
            }
            else{
                System.out.println("Its not palindrome..");
            }
        }
}
