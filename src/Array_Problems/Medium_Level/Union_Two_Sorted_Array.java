package Array_Problems.Medium_Level;

import java.util.ArrayList;

public class Union_Two_Sorted_Array {
    public static ArrayList<Integer>findUnion(int arr1[], int arr2[], int m, int n){
        int i=0, j=0;
        ArrayList<Integer> union=new ArrayList<>();

        while (i<m && j<n){
            int u=union.size();
            if(arr1[i]<=arr2[j]) {
                if (u == 0 || union.get(u - 1) != arr1[i])
                    union.add(arr1[i]);
                i++;
            }
            else{
                if(u==0 || union.get(u-1)!=arr2[j])
                    union.add(arr2[j]);
                j++;
            }
        }
        while (i<m){
            int u=union.size();
            if (u==0 || union.get(u-1)!=arr1[i])
                union.add(arr1[i]);
            i++;
        }
        while (j<n){
            int u=union.size();
            if (u==0 || union.get(u-1)!=arr2[j])
                union.add(arr2[j]);
            j++;
        }
        return union;
    }
    public static void main(String[] args) {
        int[] arr1={1,2,3,3,4,5,6,7,8,9,9,10};
        int[] arr2={2,3,4,5,5,5,6,7,8,8,9,10};
        int m=arr1.length;
        int n=arr2.length;


        ArrayList<Integer> unionArray = findUnion(arr1, arr2, m,n);
        System.out.println("The unique element or the union of the both array is : ");
        for (int value:unionArray){
            System.out.print(value+" ");
        }
    }
}
