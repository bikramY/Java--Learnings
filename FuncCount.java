public class FuncCount {
    public static int a;
    public static void Count() {
        System.out.println("This function is called "+ a +" Times");
        a=a+1;

    }

    public static void main(String[] args) {
        Count();
        Count();
       Count();


    }
}
