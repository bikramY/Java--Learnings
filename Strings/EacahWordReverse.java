package Strings;

public class EacahWordReverse {
    public static String main(String[] args) {
        String s1="Hello my name is bikram";
        String word[]= s1.split("\\s");
        String wordrev="";
        for(String w:word){
            StringBuilder sb= new StringBuilder(w);
            sb.reverse();
            wordrev+=sb.toString()+" ";
        }
        return wordrev.trim();
    }
    }

