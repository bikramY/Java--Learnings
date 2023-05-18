package Strings;

public class SubStrings {
    public static void main(String[] args) {
        String sentence="MY name is bikram";
        String rev= sentence.substring(sentence.length()-3);
        System.out.println(rev);

        for(int i=sentence.length()-1;i>=0;i--){
            System.out.print(sentence.charAt(i));
        }
    }
}
