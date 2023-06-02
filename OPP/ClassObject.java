package OPP;

 class Example{
    String str="My name is";
    public  void name(){
        System.out.println(str);
    }
}
class  newExample extends Example{

     public  void namePrint(String name) {
         System.out.println(str+" "+name);
     }
}
public class ClassObject {
    public static void main(String[] args) {
        newExample ne= new  newExample();
        ne.namePrint("Something");
    }
}