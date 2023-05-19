package Strings;

import java.util.Scanner;

public class Occurance {
    public static void CheckOccuracne() {
        Scanner sc= new Scanner(System.in);
        System.out.println("please enter the sentence");
        String sentence= sc.nextLine();
        System.out.println("please enter the index");
        String index= sc.nextLine();

        String new_word= sentence.replace(index,"");
        System.out.println("The occurance of the index give is "+(sentence.length()-new_word.length()));

    }
    public static void main(String[] args) {
        CheckOccuracne();

    }
}
