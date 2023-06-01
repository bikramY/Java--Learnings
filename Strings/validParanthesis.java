package Strings;

public class validParanthesis {
    public static void main(String[] args) {
        String para="(]";
        boolean flag= true;
        for (int i=0;i<para.length()-1;i++) {
            if(para.charAt(i)=='(' || para.charAt(i+1)==')'){
                System.out.println("True");
                flag=false;


            }
        }
        if(flag){
            System.out.println("False");
        }
    }
}
