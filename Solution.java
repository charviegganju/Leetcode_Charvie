//import java.io.*;
//import java.util.*;
//
//public class Solution {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        String a = sc.nextLine();
//        String b = sc.nextLine();
//
//        int len = a.length() + b.length();
//        System.out.println(len);
//
//        if(a.compareTo(b) <= 0){
//            System.out.println("No");
//        }
//        else{
//            System.out.println("Yes");
//        }
//
//        String A = a.substring(0,1).toUpperCase() + a.substring(1);
//        String B = b.substring(0,1).toUpperCase() + b.substring(1);
//
//        System.out.println(A + " " + B);
//    }
//}



//import java.util.*;
//public class Solution{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        int start = sc.nextInt();
//        int end = sc.nextInt();
//        System.out.print(s.substring(start,end));
//    }
//}



// SMALLEST AND LARGEST SUBSTRING
//import java.util.Scanner;
//
//public class Solution {
//
//    public static String getSmallestAndLargest(String s, int k) {
//        String smallest = s.substring(0,k);
//        String largest = s.substring(0,k);
//
//        for(int i = 1; i<=s.length()-k; i++){
//            String subS = s.substring(i,i+k);
//
//            if(subS.compareTo(smallest)<0 ){
//                smallest = subS;
//            }
//            if(subS.compareTo(largest)>0){
//                largest = subS;
//            }
//        }
//
//        return smallest + "\n" + largest;
//    }
//
//
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        String s = scan.next();
//        int k = scan.nextInt();
//        scan.close();
//
//        System.out.println(getSmallestAndLargest(s, k));
//    }
//}




//// STRING PALINDROME
//import java.io.*;
//import java.util.*;
//
//public class Solution {
//
//    public static void main(String[] args) {
//
//        Scanner sc=new Scanner(System.in);
//        String A=sc.next();
//
//        String revA = "";
//
//        for(int i=A.length()-1; i>=0; i--){
//            revA += A.charAt(i);
//        }
//
//        if(revA.compareTo(A)==0){
//            System.out.println("Yes");
//        }
//        else{
//            System.out.println("No");
//        }
//    }
//}



import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        String a = "anagrams";
        int count = 0;
        for(int i=0; i<a.length()-1; i++){
            if(a.charAt(i)==a.charAt(i+1)){
                count+=1;
            }
            if(a.charAt(i)!=a.charAt(i+1)){
                count=1;
            }
        }
        System.out.println(count);
    }
}