package Strings;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String word="Biikraamm";
        String new_word="";
        for (int i=0;i<word.length();i++){
            if(new_word.contains(String.valueOf(word.charAt(i)))){
                new_word=new_word+"";
            }
            else {
                new_word=new_word+word.charAt(i);
            }

        }
        System.out.println(new_word);



    }

}
