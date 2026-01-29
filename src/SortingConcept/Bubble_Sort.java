//package SortingConcept;
//
//import java.util.Scanner;
//
//public class Bubble_Sort {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the size of the array: ");
//        int size=sc.nextInt();
//        int arr[]=new int[size];
//        System.out.println("Enter the value for the array: ");
//
//        for (int i=0; i<size; i++){
//            arr[i]=sc.nextInt();
//        }
//
//        //Logic for Bubble sort
//
//        for (int i=size-1; i>=0; i--){
//            for (int j=0; j<=i-1; j++){
//                if (arr[j]>arr[j+1]){
//                    int temp=arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=temp;
//                }
//            }
//        }
//
//        System.out.println("Now the complete sorted array: ");
//        for (int i=0; i<size; i++){
//            System.out.print(arr[i]+" ");
//        }
//    }
//}


//The below is the optimized condition what if the array is already sorted...

package SortingConcept;

import java.util.Scanner;

public class Bubble_Sort {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the value for the array: ");

        for (int i=0; i<size; i++){
            arr[i]=sc.nextInt();
        }

        //Logic for Bubble sort


        for (int i=size-1; i>=0; i--){
            boolean swapped =false;
            for (int j=0; j<=i-1; j++){
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
            }
            if (!swapped){
                System.out.println("Array is already in sorted order....");
                break;
            }
        }


        System.out.println("Now the complete sorted array: ");
        for (int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
