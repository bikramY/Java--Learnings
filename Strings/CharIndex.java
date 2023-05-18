package Strings;

public class CharIndex {
    public static void ReverseString(String word) {
        int len= word.length();
        for(int i=len-1;i>=0;i--){
            System.out.print(word.charAt(i));
        }

    }
    public static void main(String[] args) {
        ReverseString("Bikram");

    }
}
