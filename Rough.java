//public class Rough {
//    public static void calc(int term) {
//        int a=0;
//        int b=1;
//        int c;
//        for (int i=1;i<=term;i++){
//            System.out.print(a+" ");
//            c=a+b;
//            a=b;
//            b=c;
//        }
//    }
//
//    public static void main(String[] args) {
//        calc(15);
//
//    }
//}

//prime number

import java.util.Scanner;

public class Rough {
    public static void prime(int num) {

        if( num<=0){
            System.out.println("Invalid number");
        }
        else {
            for(int i=2;i<num;i++){
                if(num%i==0){
                    System.out.println("It is not a prime number");

                }
                if(num%i!=0) {
                    System.out.println("it is a prime number");

                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("please enter the number to check prime");
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        prime(num);
    }
}