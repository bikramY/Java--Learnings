package LinkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.*;

public class sortingLL {
    public static void main(String[] args) {
        LinkedList<Integer> ll1= new LinkedList<>();
        ll1.add(7);
        ll1.add(78);
        ll1.add(89);
        ll1.add(2);
        ll1.add(56);

        List<Integer> list = new ArrayList<>(ll1);
        //sorting a list
        Collections.sort(list);
        int index=Collections.binarySearch(list,56);

        System.out.println(index);
    }

}
