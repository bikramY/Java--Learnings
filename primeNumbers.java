
public class primeNumbers {
    public static void main(String[] args) {

        int num=20;
        for(int i=1;i<num;i++){
            int count=0;
            for (int j=2; j<num/2;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count>0){
                System.out.println(i);
            }

        }
    }
}
