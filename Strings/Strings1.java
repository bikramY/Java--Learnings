package Strings;

import java.util.Scanner;

public class Strings1 {
    public static void FirstLastName(String First, String Last,int index) {
        for(int i=0;i<index;i++){
            System.out.println("Full name is "+First+" "+Last);
        }
        String sum= First+Last;
        System.out.println("The length of the full name is "+sum.length());

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("please enter first name");
        String First= sc.next();
        System.out.println("please enter second name");
        String Last= sc.next();
        FirstLastName(First,Last,5);
    }
}
