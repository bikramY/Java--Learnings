public class linearSeaarch {
    public static void main(String[] args) {
        int[] myNum = {10, 20, 30, 40,76,3,5787,32,4,6,7,78,54,43,4,54,65,6};
        int find=6;
        for (int i=0; i<myNum.length;i++){
            if(myNum[i]==find){
                System.out.println("The given number is at " +i+" place");
            }
        }
    }
}
