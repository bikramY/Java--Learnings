import java.util.Scanner;

public class functions {
    public static void adds(double x, double y){
        double sum=x+y;
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double x= sc.nextDouble();
        double y= sc.nextDouble();
        adds(x,y);
    }
}
