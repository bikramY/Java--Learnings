package Questions;

import java.util.ArrayList;

//Write a function that accepts a character array,
//        a zero-based start position and a length. It should return a character array containing containing
//        lengthcharacters starting with the startcharacter of the input array. The function should do error
//        checking on the start position and the length and return null if the either value is not legal.
//        The function signature is:
//        char[ ] f(char[ ] a, int start, int len)
public class MaharishiQues2 {
    //{‘a’, ‘b’, ‘c’}, 0, 4
    public static void main(String[] args) {
        int startIndex=1;
        int length=2;
        ArrayList<Character> arr= new ArrayList<>();

        char[] JavaCharArray = new char[3];
        JavaCharArray[0]='a';
        JavaCharArray[1]='b';
        JavaCharArray[2]='c';
        if(length>3){
            System.out.println("Null");
        }

        else {
            for (int i=startIndex;i<=length;i++){
                arr.add(JavaCharArray[i]);

            }
        }
        System.out.println(arr);


    }
}
