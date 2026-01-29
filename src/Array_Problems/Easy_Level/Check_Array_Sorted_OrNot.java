//package Array_Problems;
//
//public class Check_Array_Sorted_OrNot {
//    public static boolean isSorted(int arr[]){
//        int n= arr.length;
//        for (int i=0; i<n; i++){
//            for (int j=i+1; j<n; j++){
//                if (arr[j]<arr[i]){
//                    return false;
//                }
//            }
//        }
//        return true;
//    }
//    public static void main(String[] args) {
//        int arr[]={3,4,5,12,7,8,9};
//        System.out.println(isSorted(arr));
//    }
//}


package Array_Problems.Easy_Level;

public class Check_Array_Sorted_OrNot {
    public static boolean isSorted(int arr[]) {
        int n=arr.length;
        for (int i=1; i<arr.length; i++){
            if (arr[i]<arr[i-1]){
                return false;
            }
        }
    return true;
    }

    public static void main(String[] args) {

        int arr[]={23,42,43,56,73,94};
        System.out.println(isSorted(arr));
    }
    }
