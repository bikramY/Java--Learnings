import java.util.Scanner;

public class TwoDArraySearch {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter row");
        int row= sc.nextInt();
        System.out.println("Please enter columns");
        int cols= sc.nextInt();
        int [][] arr=new int[row][cols];

        // rows
        for(int i=0;i<row; i++){
            //columns
            for(int j=0;j<cols;j++){
                arr[i][j] =sc.nextInt();
            }
        }

        //output
        int find=5;
        for(int i=0;i<row;i++){
            for(int j=0;j<cols;j++){
                if(arr[i][j]==find){
                    System.out.println("the element is in index "+i+" "+j);
                    break;
                }

            }
        }



    }
}
