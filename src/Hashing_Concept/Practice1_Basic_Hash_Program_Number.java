package Hashing_Concept;

import java.util.Scanner;

public class  Practice1_Basic_Hash_Program_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();

        System.out.println("Enter the elements for the array: ");
        int arr[]=new int[n];
        for (int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        // Precompute
        int []hashArray=new int[13];
        for (int i=0; i<n; i++){
//            hashArray[arr[i]]+=1;
            hashArray[arr[i]]+=1;
        }
        System.out.println("Enter the number of question you want to ask: ");
        int question=sc.nextInt();
        while (question-- !=0){
            System.out.println("Enter the number you want to see the occurance: ");
            int number=sc.nextInt();
//            fetching
            System.out.println(hashArray[number]);
        }

    }
}
