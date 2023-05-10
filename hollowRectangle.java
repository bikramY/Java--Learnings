import java.util.Scanner;

public class hollowRectangle {

        public static void main(String[] args) {
//            Scanner sc= new Scanner(System.in);
//            System.out.println("Please enter length");
//            int m= sc.nextInt();
//            System.out.println("Please enter breadth");
//            int n=sc.nextInt();
            int m=5;
            int n=4;

            for (int i = 1; i <=n; i++) {
                for (int j = 1; j <=m; j++) {
                    if(i==1 || j==1 ||  i==m || j==n) {
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }

                }
                System.out.println();

            }
        }
    }


