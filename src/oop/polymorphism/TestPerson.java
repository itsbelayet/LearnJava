package oop.polymorphism;

public class TestPerson {

    public static void main(String[] args) {

        /*
        Teacher t=new Teacher();
        t.display();
        Student s=new Student();
        s.display();
        */

        // Another approach
        Person p=new Person();
        p.display();
        p=new Teacher();
        p.display();
        p=new Student();
        p.display();

    }
}
