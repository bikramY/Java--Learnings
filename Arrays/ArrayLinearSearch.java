package Arrays;

import java.util.Scanner;

public class ArrayLinearSearch {
    public static void main(String[] args) {
        System.out.println("please enter the size of the array");
        Scanner sc= new Scanner(System.in);

        int size= sc.nextInt();
        int Array[]= new int [size];
        for(int i=0;i<size;i++){
            System.out.println("Please enter element "+i);
            Array[i]=sc.nextInt();
        }

        for(int i=0;i<size;i++){
            System.out.print(Array[i]+" ");

        }
        System.out.println("please enter the number you want to find");
        int find= sc.nextInt();
        for(int i=0;i<size;i++){
            try {
                if(Array[i]==find){
                    System.out.println("The number is at index "+i);

                }

            }
            catch (Exception e){
                System.out.println("please enter a valid number");

            }


        }

        

    }

    public static class BubbleSoRT {
        public static void sort(int arr[]) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+" ");
            }
        }
        public static void main(String[] args) {
            int arr[] = {7, 8, 3, 1, 2};

            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = 0; j < arr.length - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        //swap
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
            sort(arr);

        }
    }
}
