//package Array_Problems;
//
//import java.util.HashSet;
//import java.util.Set;
//
//public class RemoveDuplicate {
//    public static int removeDuplicate(int[] arr){
//        Set<Integer> set = new HashSet<>();
//        for (int num:arr){
//            set.add(num);
//        }
//        int index=0;
//        for (int num:set) {
//            arr[index++] = num;
//        }
//        return set.size();
//    }
//
//    public static void main(String[] args) {
//
//        int arr[]={2,2,3,3,4,5,5,5,6,7,8,8};
//        System.out.println("Array after removing duplicate elements: ");
//        int k=removeDuplicate(arr);
//        for (int i=0; i<k; i++){
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//        System.out.println("Number of unique elements: "+k);
//    }
//}


package Array_Problems.Easy_Level;
public class RemoveDuplicate {
    public static int removeDuplicate(int[] arr) {
        int n=arr.length;
        if (n==0 || n==1) return n;

        int i=0;
        for (int j=1; j<n; j++){
            if (arr[j]!=arr[i]){
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;
    }

    public static void main(String[] args) {

        int arr[]={2,3,4,4,5,5,5,6,7,8,8,9};
        int k=removeDuplicate(arr);
        System.out.println("Array after removing duplicate elements: ");
        for (int i=0; i<k; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("The number of unique elements are : "+k);
    }

    }