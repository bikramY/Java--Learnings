package Arrays;

import java.util.*;

import static java.util.Arrays.sort;

public class PalindromeArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str= sc.next();

        String rev="";
        for (int i=str.length()-1;i>=0;i--){
            rev= rev+str.charAt(i);
        }
        System.out.println(rev);
        char[] arr=str.toLowerCase().toCharArray();
        char[] rev2=rev.toLowerCase().toCharArray();
        if(Arrays.equals(rev2,arr)){
            System.out.println("They are palindrome");
        }
        else {
            System.out.println("they are not");
        }




//       if(li1==li2){
//           System.out.println("this is a palindrome");
//       }
//       else{
//           System.out.println("noo");
//       }





    }
}
