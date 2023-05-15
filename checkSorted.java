import java.util.Scanner;

public class checkSorted {
    public static void Check() {
        System.out.println("Please enter the length of array");
        Scanner sc= new Scanner(System.in);
        int size= sc.nextInt();
        int arr[]= new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i< arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                System.out.println("It is not sorted");
                break;
            }
            if (arr[i]<arr[i+1]){
                System.out.println("It is a sorted array");
                break;
            }
        }

    }
    public static void main(String[] args) {
        Check();
    }
}
