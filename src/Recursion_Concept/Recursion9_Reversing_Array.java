package Recursion_Concept;

public class Recursion9_Reversing_Array {
    public static void printReversedArray(int arr[], int index){
        if (index<0)
            return;
        System.out.print(arr[index]+" ");
        printReversedArray(arr, index-1);
    }
    public static void main(String[] args) {
        int arr[]={9,8,7,6,5,4};
        int index=arr.length-1;
        printReversedArray(arr,index);
    }
}
