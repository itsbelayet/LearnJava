package oop.encapsulation;

public class TestEncapsulation {

    public static void main(String[] args) {
        Person p=new Person();
        p.sName("Miru");
        p.sAge(57);

        System.out.println(p.gName());
        System.out.println(p.gAge());

    }
}
