package HashMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class TwoSum {
    public static void twosum() {
//        int num[]={2,4,7,11,15};
//        int target=9;
//        for(int i=1;i<num.length;i++){
//            for (int j = 0; j < num.length; j++) {
//                if(target==num[i]+num[j]){
//                    System.out.println(i);
//                    System.out.println(j);
//                }
//
//            }
//        }
        int num[] = {2, 7, 11, 15};
        int target = 9;
//
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> arr= new ArrayList<>();
        //storing value and index in hasmap
        for (int i = 0; i < num.length; i++) {
            map.put(num[i], i);
        }

        // searching
        for (int i = 0; i < num.length; i++) {
            int number = num[i];
            int rem = target - number;
            if (map.containsKey(rem)) {
                int index = map.get(rem);
                arr.add(i);
                arr.add(index);

            }
        }
        System.out.println(arr);


    }

        public static void main(String[] args) {
        twosum();

    }

    }

