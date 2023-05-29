package Arrays;

public class MaxMin {
    public static void main(String[] args) {
        int max = 0;
        int min = 0;
        int arr[] = {4, 6, 78,2,2, 90, 1};
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                max = arr[i];
                min = arr[i + 1];

            }
        }


        System.out.println(max);
        System.out.println(min);
    }
}
