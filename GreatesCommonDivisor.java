import java.util.zip.CheckedOutputStream;

public class GreatesCommonDivisor {
    public static void GCD(int a, int b) {
        int factors=0;
        for(int i=1; i<=b;i++){
            if(a%i==0 && b%i==0){
                factors=i;

            }
        }
        System.out.println(factors);
    }

    public static void main(String[] args) {
        GCD(50,60);

    }
}
