package Array_Problems.Medium_Level;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Find_Number_Appears_Once {

        public static int getSingleElement_BruteForceApprocach ( int arr[]){
        int n = arr.length;

        //Run a loop for selecting elements:
        for (int i = 0; i < n; i++) {
            int num = arr[i]; // selected element
            int cnt = 0;

            //find the occurrence using linear search:
            for (int j = 0; j < n; j++) {
                if (arr[j] == num)
                    cnt++;
            }

            // if the occurrence is 1 return ans:
            if (cnt == 1) return num;
        }

        //This line will never execute
        //if the array contains a single element.
        return -1;

    }

    public static ArrayList<Integer> getSingleElementBetterApproach1(int []arr){
            int n=arr.length;
            //find the maxi element by which we can short out the size of the hash array
        int maxi=arr[0];
            for (int i=0; i<n; i++){
                maxi=Math.max(maxi,arr[i]);
            }
            // storing the array elements in to hash or hasing the array
            int []hashArray= new int[maxi+1];
            for (int i=0; i<n; i++){
                hashArray[arr[i]]++;
            }

            // find the sinhgle element and then return it.
        ArrayList<Integer> list=new ArrayList<>();
        for (int i=0; i<n; i++){
            if (hashArray[arr[i]]==1)
                 list.add(arr[i]);
        }
            return list;

    }

    public static ArrayList<Integer> getSingleElement_BetterApproach2(int arr[]){
            int n=arr.length;

            // declare a hash map
        HashMap<Integer, Integer> mpp= new HashMap<>();
        for (int i=0; i<n; i++){
            int value=mpp.getOrDefault(arr[i],0);
            mpp.put(arr[i], value+1);
        }

        //find the single element
        ArrayList<Integer> list=new ArrayList<>();
        for (Map.Entry<Integer, Integer> it: mpp.entrySet()){
            if (it.getValue()==1)
                list.add(it.getKey());

        }
            return list;
    }

    public static int getSingleElement_OptimalApproach(int[] arr){
            int n=arr.length;
            int xorr=0;
        ArrayList<Integer>singleElements=new ArrayList<>();
            for (int i=0; i<n; i++){
                xorr=xorr^arr[i];
            }


        return xorr;
    }
    public static void main(String[] args) {

            int arr[]={2,3,4,2,3,3,5,6,2};
//        System.out.println("The single element is: "+getSingleElement_BruteForceApprocach(arr));
        System.out.println("The single element is: "+getSingleElementBetterApproach1(arr));
        System.out.println("The single element is: "+getSingleElement_BetterApproach2(arr));
//        System.out.println("The single element is : "+getSingleElement_OptimalApproach(arr));
    }
}
