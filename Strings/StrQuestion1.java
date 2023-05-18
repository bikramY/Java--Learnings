package Strings;

import java.util.Scanner;

public class StrQuestion1 {
    public static int index ;

    public static void User(String email) {

        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@') {
                 index = i;
            }
        }
        String username = email.substring(0,index);
        System.out.println(username);
    }


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter your email address");
        String email = sc.next();
        User(email);

    }
}
