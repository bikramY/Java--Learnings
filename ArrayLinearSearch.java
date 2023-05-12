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
}
