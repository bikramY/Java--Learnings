package Strings;

import java.util.Scanner;

public class Rough {
    public static void CheckOccuracne() {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the sentence");
        String sentence = sc.nextLine();

        for (int i = 0; i < sentence.length(); i++) {

            String new_word = sentence.replace(String.valueOf(sentence.charAt(i)), "");

             System.out.println("The occurance of " +sentence.charAt(i) + " is " + (sentence.length() - new_word.length()));

        }
    }
    public static void main(String[] args) {
        CheckOccuracne();

    }
}
