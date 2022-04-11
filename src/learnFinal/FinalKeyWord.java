package learnFinal;

class A{
    final void display(){
        System.out.println("Testing Final keyword <Parents>");
    }
}
class B extends A{
//    void display(){
//        System.out.println("Testing Final keyword <Child>");
//    }
}

public class FinalKeyWord {
    final int speed=40;

    public static void main(String[] args) {
        FinalKeyWord fk=new FinalKeyWord();

        //fk.speed=85;
        System.out.println(fk.speed);

        A a=new A();
        a.display();
    }
}
