package Questions;


//Write a function that takes an array of integers as an argument and returns a value
//        based on the sums of the even and odd numbers in the array. Let X = the sum of
//        the odd numbers in the array and
//        let Y = the sum of the even numbers. The function should return X – Y
public class MaharishiQue {
    public static void sum() {
        int arr[]={3, 2, 3, 4};
        int oddSum=0;
        int evenSum=0;
        for (Integer e:arr){
            if(e%2==0){
                evenSum=evenSum+e;
            }
            else {
                oddSum=oddSum+e;
            }

        }

        System.out.println(oddSum-evenSum);

    }
    public static void main(String[] args) {
        sum();

    }
}
