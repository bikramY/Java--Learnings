import java.util.Scanner;
public class oddeven {
    public static void main(String[] args) {
        System.out.println("Please enter a number");

        Scanner sc= new Scanner(System.in);
        int number= sc.nextInt();
        if (number==0) {
            System.out.println("it is neither");
        }
            else{
                if (number % 2 == 0) {
                    System.out.println("It is even");

                } else {
                    System.out.println("It is odd");
                }

            }
        }
    }

