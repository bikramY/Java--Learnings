public class PowerRaise {
    public static void PowerCalculator(int x, int y) {
        int sum=1;
        for(int i=1;i<=y;i++) {
            sum =sum*x;
        }

        System.out.println(sum);
    }

    public static void main(String[] args) {
        PowerCalculator(5,5);

    }
}
