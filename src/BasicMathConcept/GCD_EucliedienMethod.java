package BasicMathConcept;

import java.util.Scanner;

public class GCD_EucliedienMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a= sc.nextInt();
        System.out.println("Enter second number: ");
        int b=sc.nextInt();

        while (a>0 && b>0){
            if (a>b){
                a=a%b;
            }
            else {
                b=b%a;
            }


        }
        if (a==0){
            System.out.println(b);
        }
        else {
            System.out.println(a);
        }

    }
}
