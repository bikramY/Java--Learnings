package OPP;

abstract  class animal{
    abstract void walk();
    abstract void color();
}
class chicken extends  animal{
     public void walk(){
         System.out.println("Chicken walks with 2 legs");
     }
     void color(){
         System.out.println("chicken has many colors");
     }
}


public class Abstraction {
    public static void main(String[] args) {
        chicken c1= new chicken();
        c1.walk();
        c1.color();

    }
}
