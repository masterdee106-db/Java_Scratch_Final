package SortingConcept;

import java.util.Scanner;

public class Insertion_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the value for the array: ");

        for (int i=0; i<size; i++){
            arr[i]=sc.nextInt();
        }

        //Logic for insertion sort...

        for (int i=0; i<size-1; i++){
            for (int j=i+1; j>0; j--){
                if (arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }

        System.out.println("Array After Insetion sort: ");
        for (int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }

    }
}
