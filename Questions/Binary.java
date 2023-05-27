package Questions;

public class Binary {
    public static void main(String[] args) {
        String s1="123";
        String s2="45";
        int s1I= Integer.parseInt(s1);
        int s2I=Integer.parseInt(s2);
        int sum=s1I+s2I;
        System.out.println(Integer.toBinaryString(sum));
    }
}
