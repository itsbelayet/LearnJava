package oop.polymorphism;

public class OverLoading {
    //Non-Static Method
    void a(){
        System.out.println("No Parameter");
    }
    void a(String name){
        System.out.println("Single Parameter : "+name);
    }
    void a(String name, int age){
        System.out.println("Double Parameter : "+name+" Age : "+age);
    }

    // Static Method

    static void b(){
        System.out.println("Static Method with no parameter");
    }
    static void b(String name){
        System.out.println("Static Method with Name parameter : "+name);
    }
    static void b(String name,int age){
        System.out.println("Static Method with Name & Age parameter : "+name+"  "+age);
    }

    public static void main(String[] args) {
        OverLoading obj=new OverLoading();
        obj.a();
        obj.a("Belayet");
        obj.a("Belayet",57);

        System.out.println("\n************************\n");

        b();
        b("Miru");
        b("Miru",57);
    }

}
