public class factorialFunction {
    public static void Factorial(int num) {
        int fact=1;
        if(num<1){
            System.out.println("Invalid number");
        }
        else {
            for (int i = num; i >= 1; i--) {
                fact = fact * i;

            }
            System.out.println(fact);
        }
    }

    public static void main(String[] args) {
        Factorial(-9);

    }
}
