package oop.inharitance;


class A{
    int a;
    void display(){
        System.out.println("This is class A' value "+a);
    }
}

class B extends A{
    int b;
    void print(){
        System.out.println("This is class B' value "+b);
    }
}
public class LearnInheritance {

    public static void main(String[] args) {
        B b=new B();
        b.a=500;
        b.b=700;
        b.display();
        b.print();
    }
}