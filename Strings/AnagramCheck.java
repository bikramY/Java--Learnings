package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {
    public static void CheckAna(String s1,String s2) {
       if(s1.length()!=s2.length()){
           System.out.println("The strings are not anagram");
       }
       else {
           char[] ArrayS1 = s1.toLowerCase().toCharArray();
           char[] ArrayS2 = s2.toLowerCase().toCharArray();
           Arrays.sort(ArrayS1);
           Arrays.sort(ArrayS2);
           if(Arrays.equals(ArrayS1,ArrayS2)){
               System.out.println("They are anagram");
           }
           else {
               System.out.println("No they are not anagram");
           }
       }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s1= sc.nextLine();
        String s2= sc.nextLine();
        CheckAna(s1,s2);

    }
}
