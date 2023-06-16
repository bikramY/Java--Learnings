package OPP;

class car{
    private String make;
    protected  String model;

    public int year;

    public  String getMake(){
        return make;
    }

    void setMake(String make){
        this.make=make;
    }

}

public class encapsulation {
    public static void main(String[] args) {
        car c1= new car();
        c1.setMake("FORD");
        System.out.println(c1.getMake());
    }
}
