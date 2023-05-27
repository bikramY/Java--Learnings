package Arrays;

import java.util.Scanner;

public class SumOfAllElements {
    public static void SumOfArr(int size) {
        System.out.println("please enter the elements");
        Scanner sc= new Scanner(System.in);
        int Arr[]= new int[size];
        for(int i=0;i<size;i++){

            Arr[i]= sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<size;i++){
            sum=sum+Arr[i];

        }
        System.out.println(sum);

    }
    public static void main(String[] args) {
        System.out.println("please enter the size of array");
        Scanner sc= new Scanner(System.in);
        int size=sc.nextInt();
        SumOfArr(size);
    }
}
