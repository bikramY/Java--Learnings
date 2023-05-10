import java.util.Scanner;

public class userInput {
    public static void Count(int num) {
        Scanner sc= new Scanner(System.in);
        int positive=0;
        int negative=0;
        int zeros=0;
        for(int i=1; i<=num;i++){
            System.out.println("Please enter "+i+" Number");
            int userinput= sc.nextInt();
            if(userinput==0){
                zeros++;

            }
            if (userinput<0){
                negative++;
            }
            if(userinput>0) {
                positive++;
            }
        }
        System.out.println("Total number of  Positive, Negative, Zero numbers are "+'\n'+positive+ '\n' + negative +'\n'
                + zeros);


    }

    public static void main(String[] args) {
        Count(6);

    }
}
