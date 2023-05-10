import java.util.*;
public class tableOfAnumber {
    public static void main(String[] args) {
        System.out.println("Please enter your table number");
        Scanner sc = new Scanner(System.in);
        int number= sc.nextInt();
        for (int i=1; i<11;i++){
            int mul=number*i;
            System.out.println(number+"x"+i+"="+mul);
        }
    }
}

