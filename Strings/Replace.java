package Strings;

import java.util.Scanner;

public class Replace {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the word");
        String word= sc.next();
        int size= word.length();
        String result="";
        for(int i=0;i<size;i++){
            if(word.charAt(i)=='e'){
                result=result+'i';
            }
            else{
                result=result+word.charAt(i);
            }
        }
        System.out.println(result);


    }
}
