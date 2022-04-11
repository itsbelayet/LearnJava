package singleton;

public class Singleton {
    // How to design Singleton Class
    // 1. Create a instance of Singleton class which will be private and static
    private static Singleton instance=new Singleton();

    // 2. Create a private Constructor
    private Singleton(){

    }

    // 3. Create a public static return type Method(getInstance) which return the instance
    public static Singleton getInstance(){
        return instance;
    }

    public void getMessage(){
        System.out.println("This is Singleton Class");
    }

}
