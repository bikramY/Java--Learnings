import java.util.*;
public class rectanglePattern {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter length");
        int m= sc.nextInt();
        System.out.println("Please enter breadth");
        int n=sc.nextInt();
        for (int j = 1; j <=m; j++) {
            for (int i = 0; i <=n; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
