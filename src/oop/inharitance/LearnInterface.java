package oop.inharitance;

class A1 extends AC{
    void methodOfA1(){
        System.out.println("This is Class A1's Method");
    }

    @Override
    void absMethod() {
        System.out.println("This is Abstract class Abstract method");
    }
}

interface IF1{
    void methodOfIF1();
}
interface IF2{
    void methodOfIF2();
}

abstract class AC{
    void abMethod(){
        System.out.println("This is Abstract class Non-Abstract method");
    }
    abstract void absMethod();
}

public class LearnInterface extends A1 implements IF1,IF2 {


    @Override
    void abMethod() {
        super.abMethod();
    }

//    @Override
//    void absMethod() {
//        System.out.println("This is Abstract class Abstract Method");
//    }

    @Override
    public void methodOfIF1() {
        System.out.println("This is Interface of IF1");
    }

    @Override
    public void methodOfIF2() {
        System.out.println("This is Interface of IF2");
    }

    public static void main(String[] args) {
        LearnInterface li=new LearnInterface();
        li.methodOfA1();
        li.methodOfIF1();
        li.methodOfIF2();
        li.abMethod();
        li.absMethod();
    }
}
