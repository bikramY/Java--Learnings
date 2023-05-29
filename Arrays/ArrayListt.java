package Arrays;
import  java.util.*;
public class ArrayListt {
    public static void main(String[] args) {
        ArrayList <Integer> list= new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(9);
        for(int i=0;i<5;i++){
            System.out.println("please ");
            Scanner sc= new Scanner(System.in);
            list.add(sc.nextInt() );
        }

//        list.remove(2);
        System.out.println(list);
//        Collections.sort(list);
        Collections.reverse(list);
        System.out.println(list);

    }
}
