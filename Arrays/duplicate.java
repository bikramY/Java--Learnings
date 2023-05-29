package Arrays;

public class duplicate {
    public static void main(String[] args) {
        int arr[]= {1,4,6,84,2};
        int a=1;
        boolean flag=true;
        for (int i=0;i<arr.length-1;i++){
            for (int j=i+1;j<arr.length-1;j++) {
                if (arr[i] == arr[j ]) {
                    System.out.println("Duplicate found at index " + i + " and " +j+ " the duplicate number is " + arr[i]);
                    flag=false;

                }

            }

        }
        if(flag){
            System.out.println("Not found any duplicate elements");
        }
    }
}
