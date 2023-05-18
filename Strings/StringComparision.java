package Strings;

public class StringComparision {
    public static void main(String[] args) {
        String a="BIKRAM";
        String b="BIKRAM";
        if(a.compareTo(b)==0){
            System.out.println("they are equal");
        }
        if(a.compareTo(b)>0){
            System.out.println("A is greter than B");
        }
        if(a.compareTo(b)<0) {
            System.out.println("B is greater than A");
        }
    }
}
