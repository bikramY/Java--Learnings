import java.util.Scanner;

//1.Take an array of names as input from the user and print them on the screen.
public class ArrayQuestion1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter the number of names you want to input");
        int size= sc.nextInt();
        String names[] = new String[size];
        for(int i=0;i<size;i++){
            System.out.println("Please enter name no. "+(i+1));
            names[i]=sc.next();
        }

        for(int i=0;i<size;i++){
            System.out.print(names[i]+" ");
        }


    }

}
