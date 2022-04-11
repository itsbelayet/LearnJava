package oop.encapsulation;

public class Person {
    private String name;
    private int age;

    public void sName(String name) {
        this.name = name;
    }

    public void sAge(int age){
        this.age=age;
    }

    public String gName(){
        return name;
    }
    public int gAge(){
        return age;
    }

}
