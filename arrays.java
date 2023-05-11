import java.util.Scanner;

public class arrays {

    public static void main(String[] args) {
        System.out.println("please enter size of array");
        Scanner sc=new Scanner(System.in);
        int size= sc.nextInt();
        int numbers[]= new int[size];
        for(int i=0;i<size;i++){
            numbers[i]= sc.nextInt();
        }
        for(int i=0; i<size;i++){
            System.out.println(numbers[i]);
        }


    }
}
