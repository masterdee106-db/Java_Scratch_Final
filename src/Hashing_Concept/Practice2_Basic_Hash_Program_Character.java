//The below code will only focus on small letter alphabets

//package Hashing_Concept;
//
//import java.util.Scanner;
//
//public class Practice2_Basic_Hash_Program_Character {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the String: ");
//        String s = sc.next();
//
//        //Precompute
//        int []hashArray = new int[26];
//        for (int i=0; i<s.length(); i++){
//            hashArray[s.charAt(i)-'a']+=1;
//        }
//
//        System.out.println("Enter How many question you want to ask: ");
//        int q=sc.nextInt();
//        while (q-- >0){
//            System.out.println("Enter the character you want frequency: ");
//            char c = sc.next().charAt(0);
//
//            //fetch
//            System.out.println(hashArray[c-'a']);
//        }
//
//
//    }
//}


// The below code is for checking the occurance for all popssibility include aA1@

package Hashing_Concept;

import java.util.Scanner;

public class Practice2_Basic_Hash_Program_Character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s = sc.next();

        //Precompute
        int []hashArray = new int[256];
        for (int i=0; i<s.length(); i++){
            hashArray[s.charAt(i)]+=1;
        }

        System.out.println("Enter How many question you want to ask: ");
        int q=sc.nextInt();
        while (q-- >0){
            System.out.println("Enter the character you want frequency: ");
            char c = sc.next().charAt(0);

            //fetch
            System.out.println(hashArray[c]);
        }


    }
}
