package Questions;

public class PrimeCheck {
    public static void main(String[] args) {
        int num=19;
        for(int i=2;i<Math.sqrt(num);i++){
            if(num%i==0){
                System.out.println("it is not a prime number");
                break;


            }
            if(num%i!=0) {
                System.out.println("it is prime number");
                break;
            }


        }
    }


    }

