package Arrays;

public class BubbleSort {
    public static void Sort(int Arr[]) {
        for (int i=0;i<Arr.length;i++){
            System.out.print(Arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int Arr[]={7,8,3,1,2};

        for(int i=0;i<Arr.length-1;i++){

            for(int j=0;j<Arr.length-i-1;j++){

                if(Arr[j]>Arr[j+1]){
                    int temp=Arr[j];
                    Arr[j]=Arr[j+1];
                    Arr[j+1]=temp;
                }
            }
        }
        Sort(Arr);

    }
}
