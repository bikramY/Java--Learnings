package Strings;

import java.util.Scanner;

public class LastThree {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter the Word");
        String word= sc.next();

        for(int i=word.length()-3;i<word.length();i++){
            System.out.print(word.charAt(i));


        }

    }
}
