package Arrays;

import java.util.ArrayList;
import  java.util.*;

// Question from gfg
// https://practice.geeksforgeeks.org/problems/missing-number-in-array1416/1?page=1&sortBy=submissions
public class MissingNumber {

    public static void main(String[] args) {
        ArrayList<Integer>list= new ArrayList<>();
        Scanner sc= new Scanner(System.in);
        int n=10;
        for(int i=1;i<n;i++){
            System.out.println("please enter elements");
            list.add(sc.nextInt());

        }
        Collections.sort(list);

        for(int i=1;i<=n;i++){
            if(list.contains(i)){
                continue;

            }
            else {
                System.out.println(i);
            }
        }
    }
}
