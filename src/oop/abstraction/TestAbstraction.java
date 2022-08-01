package oop.abstraction;

public class TestAbstraction extends AbstractClass implements InterfaceClass {

    @Override
    void girl() {
        System.out.println("Girl's can be Mother");
    }

    @Override
    public void myId(String name) {
        System.out.println("My name is : "+name);
    }

    @Override
    public void myId(String name, int age) {
        System.out.println("My name is : "+name+" Age : "+age);
    }

    public static void main(String[] args) {
        TestAbstraction ta=new TestAbstraction();
        ta.girl();
        ta.myId("Zakir");
        ta.myId("Miru",57);

    }
}
