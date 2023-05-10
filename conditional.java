import java.util.*;
public class conditional {
    public static void main(String[] args) {
//        int a=25;
//        if (a>30){
//            a=a+10;
//            System.out.println(a);
//
//        }
//        else {
//            a=a-10;
//            System.out.println(a);

//        System.out.println("Enter the number: ");
//        Scanner sc= new Scanner(System.in);
//        int number = sc.nextInt();
//        if(number%2==0) {
//            System.out.println("The number is even");
//        }
//        else {
//                System.out.println("It is a odd number");
//            }
//        }

//switchCase
        Scanner sc= new Scanner(System.in);
        System.out.println("Please choose a botton");

        int number=sc.nextInt();
        switch (number){
            case 1:
                System.out.println("Namaskar");
                break;
            case 2:
                System.out.println("Hello");
                break;
            case 3:
                System.out.println("Bonjour");
            case 4:
                System.out.println("Sewaro");
            default:
                System.out.println("Choose a right button");

        }

    }
}

