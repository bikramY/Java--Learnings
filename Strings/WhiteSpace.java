package Strings;

public class WhiteSpace {
    public static void main(String[] args) {
        String name=" Bikram yadav is my name";
        String new_name="";
        for(int i=0;i<name.length();i++){
            if(name.charAt(i)== ' '){
                new_name=new_name+"";

            }
            if(name.charAt(i)!=' '){
                new_name=new_name+name.charAt(i);
            }
        }
        System.out.println(new_name);
    }
}
