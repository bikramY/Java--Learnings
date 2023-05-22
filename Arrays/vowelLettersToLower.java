package Arrays;

import java.util.Locale;
import java.util.Scanner;

public class vowelLettersToLower {

    public static void vowelCheck() {
        String c="AEIOUbikram";
        String b = c.toLowerCase();
        String z="";


        for(int i=0;i<b.length();i++){
            if(String.valueOf(b.charAt(i)).contains("a") || String.valueOf(b.charAt(i)).contains("e") ||
                    String.valueOf(b.charAt(i)).contains("i") || String.valueOf(b.charAt(i)).contains("o") ||
                    String.valueOf(b.charAt(i)).contains("u")){
                 z = z+ String.valueOf(b.charAt(i)).toLowerCase();
            }
            else {
                z=z+String.valueOf(b.charAt(i)).toUpperCase();

            }
        }
        System.out.println(z);


    }
    public static void main(String[] args) {
        vowelCheck();

    }
}
