package Questions;

import java.util.Arrays;
import java.util.Scanner;

public class palidnrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the word or number");
        String str= sc.next();
        String rev="";
        for (int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        System.out.println(rev);

        char arr1[]= str.toLowerCase().toCharArray();
        char arr2[]= rev.toLowerCase().toCharArray();
        if(Arrays.equals(arr1,arr2)){
            System.out.println("they are palindrome");
        }
        else {
            System.out.println("they are not palindrome");
        }
    }

}
