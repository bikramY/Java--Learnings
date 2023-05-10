public class sumOfAllOddNumbers {
    public static void sumOfOddnumbers(int n) {
        // n=10
        int total=0;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                total=total+i;
            }
        }
        System.out.println("The sum of all the odd numbers from 0 to "+n+" is "+total);

    }
    public static void main(String[] args) {
        sumOfOddnumbers(13);

    }
}
