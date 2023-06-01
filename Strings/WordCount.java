package Strings;

public class WordCount {
    public static void Count(String str ) {
        char chararr[]=str.toCharArray();

        for (int i = 0; i <str.length(); i++) {
            String rem="";
            int count=0;
            while (i<chararr.length && chararr[i]!=' '){
                rem=rem+chararr[i];//h,e,l,l,o
                i++;
                count=count+1;
            }
            if(rem.length()>0) {
                System.out.println( rem +" --> "+rem.length());
            }

        }

    }
    public static void main(String[] args) {
        String str="hello world i am java";
        Count(str);


    }
}
