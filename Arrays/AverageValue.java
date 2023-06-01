package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class AverageValue {
    public static void main(String[] args) {
        int arr[]={48,100,32,59,82};
        int sum=0;
        for (int e:arr) {
            sum+=e;
        }
        ArrayList <Integer> list= new ArrayList<>();


        System.out.println("The average of this array is " +sum/arr.length);
    }
}
