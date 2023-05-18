package Strings;

public class FindChar {
    public static void FindLetter(String letter, String word) {


        if(word.contains(letter)){
            System.out.println("Yes the word has this letter");
        }
        else {
            System.out.println("No");
        }
        System.out.println(word.toUpperCase());


    }
    public static void main(String[] args) {
        FindLetter("n","Bikram yadav is my name ");

    }
}
