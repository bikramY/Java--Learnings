package Strings;

public class CapitalizeEachWord {
    public static void main(String[] args) {
        String s1= "this is very useful";
        StringBuilder s33= new StringBuilder(s1);

        for (int i=0;i<s1.length()-1;i++){
            if(String.valueOf(s1.charAt(i)) ==" "){
                String.valueOf(s1.charAt(i+1)).toUpperCase();
            }
        }
        System.out.println(s1);
    }
}
