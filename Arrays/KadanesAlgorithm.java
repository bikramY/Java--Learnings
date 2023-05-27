package Arrays;

import java.util.ArrayList;
import java.util.Collections;
//Input:
//        N = 4
//        Arr[] = {-1,-2,-3,-4}
//        Output:
//        -1

public class KadanesAlgorithm {
    public static void main(String[] args) {
        int n=4;
        int Arr[] = {-1,-2,-3,-4};
        ArrayList<Integer> list= new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(Arr[i] );
        }
        System.out.println(list);
        int sum=0;
        for(int i=0;i<list.size();i++){
            sum= sum+ list.get(i);
        }
        System.out.println(sum);
    }
}
