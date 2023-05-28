package LinkedList;
import java.util.*;

public class LL1 {
    public static void main(String[] args) {
        LinkedList<Integer> l1= new LinkedList<>();
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<5;i++){
            System.out.println("please enter a value" );
            l1.add(sc.nextInt());

        }
        // printing a linkedlist
       for(int i=0;i<l1.size();i++){
           System.out.print(l1.get(i)+" ");
       }
       //reversing a linked list
        System.out.println(" ");
        for(int i=l1.size()-1;i>=0;i--){
            System.out.print(l1.get(i)+" ");
        }
        boolean b1=l1.isEmpty();
        System.out.println(b1);
        System.out.println("");
        // search
        if (l1.contains(5)){
            System.out.println(l1.indexOf(5));
        }
    }
}
