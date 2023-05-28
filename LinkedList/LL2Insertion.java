package LinkedList;

import java.util.*;

public class LL2Insertion {
    public static void main(String[] args) {
        LinkedList<String> ll1= new LinkedList<>();


        ll1.add("Hello");
        ll1.add("I am");
        ll1.add("Linked ");
        ll1.addLast("List");

        for(int i=0;i<ll1.size();i++){
            System.out.print(ll1.get(i)+" ");
        }
        Collections.sort(ll1);
        System.out.println(ll1);


    }


}
