import java.awt.desktop.SystemEventListener;
import java.util.*;
public class InputOutput {
    public static void main(String[] args) {
        System.out.println("Please enter your name: ");
        Scanner sc= new Scanner(System.in);
        String name= sc.nextLine();
        System.out.println("Hello "+name+" good morning");
    }
}
