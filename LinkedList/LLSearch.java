package LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class LLSearch {
    public static void main(String[] args) {
        LinkedList<Integer> ll1= new LinkedList<>();
        int [] arr= {4,65,23,77,32};
        ArrayList<Integer> list= new ArrayList<>();
        list.addAll(ll1);


        ll1.add(5);
        ll1.addFirst(89);
        ll1.addAll(list);
        ll1.addLast(67);

        for(int i=0;i<ll1.size();i++){
            System.out.print(ll1.get(i)+" ");
        }
    }
}
