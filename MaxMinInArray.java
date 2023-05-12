// maximum and minimum in an array
public class MaxMinInArray {
    public static void main(String[] args) {
        int arr[]= {4,7,12,99,54,1};
        int max= arr[0];
        int min= arr[arr.length-1];
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
            if (min>arr[i]){
                min=arr[i];
            }

        }
        System.out.println("The largest element in this array is "+max);
        System.out.println("The smallest element in this array is "+min);
    }
}
