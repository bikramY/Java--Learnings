package OPP;
class vehicle{

    int sum(int a,int b){
        return (a+b);
    }
    void run(){
        System.out.println("I am running");

    }
}
class pulsar extends vehicle{
    void sum(int a ,int c,int z){
        System.out.println(a+c+z);
    }
    void run(){
        System.out.println("Pulsar is running");
    }
}


public class Polymorphism {
    public static void main(String[] args) {
        pulsar ps1= new pulsar();
        ps1.run();
        ps1.sum(4,5,6);
    }
}
