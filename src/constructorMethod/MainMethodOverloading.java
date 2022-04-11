package constructorMethod;

public class MainMethodOverloading {

    public static void main(String[] args) {
        System.out.println("This is Main Method");
        MainMethodOverloading.main("String Parameter");
        MainMethodOverloading.main("String",2);
    }

    public static void main(String name) {
        System.out.println("This is Single parameter Main Method: "+name);
    }
    public static void main(String name,int num) {
        System.out.println("This is Double parameter Main Method: "+name+" and : "+num);
    }
}
