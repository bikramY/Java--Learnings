package Questions;

import java.util.ArrayList;

public class MaharrishiQue3 {
    public static void main(String[] args) {
        int arr1[]= {1, 8, 3, 2, 6};
        int arr2[]= {2, 6, 1};
        ArrayList<Integer> arr3= new ArrayList<>();
        for (int i=0;i<arr1.length;i++){
            for (int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    arr3.add(arr1[i]);

                }
            }
        }
        System.out.println(arr3);
    }
}
