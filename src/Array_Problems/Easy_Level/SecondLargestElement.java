//package Array_Problems;
//
//public class SecondLargestElement {
//    public static int secondLargestElement(int arr[]){
//        int largest=arr[0];
//
//        int n=arr.length;
//        for (int i=1; i<n; i++){
//            if (arr[i]>largest){
//                largest=arr[i];
//            }
//        }
//        int secondLargest=-1;
//        for (int i=0; i<n; i++){
//            if (arr[i]<largest && (secondLargest==-1 || arr[i]>secondLargest)){
//                secondLargest=arr[i];
//            }
//        }
//        return  secondLargest;
//    }
//    public static void main(String[] args) {
//
//        int arr[]={2,12,43,20,31,23};
//        System.out.println(secondLargestElement(arr));
//    }
//}
//
//

package Array_Problems.Easy_Level;

public class SecondLargestElement {
    public static int secondLargestElement(int arr[]) {

        int large=Integer.MIN_VALUE;
        int secondLarge=Integer.MIN_VALUE;
        int n=arr.length;
        if (n<2){
            System.out.println("Array must contain atleast 2 elements...");
            return -1;
        }
        for (int i=0; i<n; i++){
            if (arr[i]>large){
                secondLarge=large;
                large=arr[i];
            } else if (arr[i]>secondLarge && arr[i]!=large) {
                secondLarge=arr[i];
                
            }
        }
        if (secondLarge==Integer.MIN_VALUE){
            System.out.println("Second largest element not found(all element may  be same )");
            return -1;
        }
        return secondLarge;
    }

    public static void main(String[] args) {

        int arr[]={34,21,33,46,6,54,22};
        System.out.println(secondLargestElement(arr));
    }
    }
