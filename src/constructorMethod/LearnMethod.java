package constructorMethod;

public class LearnMethod {
    public static void main(String[] args) {
        lMethod();
        lMethod("Belayet");
        lMethod("Belayet",57);

    }
    static void lMethod(){
        System.out.println("This is Regular Method");
    }
    static void lMethod(String name){
        System.out.println("This is single parameter Method : "+name);
    }
    static void lMethod(String name, int age){
        System.out.println("This is double parameter Method : "+name+"  Age :"+age);
    }

}
