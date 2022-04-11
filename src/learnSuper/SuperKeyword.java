package learnSuper;

class Animal {

    String color="White";

    void eating() {
        System.out.println("Animal can Eating..");
    }

    Animal(){
        System.out.println("Parents Constructor < Animal >");
    }
}

class Dog extends Animal {

    String color="Red";

    void displayColor(){
        System.out.println(color+" -> Value comes from Child class");
        System.out.println(super.color+" -> Value comes from Parents class");    // Invoked the immediate parents class value
    }

    void eating() {
        System.out.println("Dog can Eating..");
        super.eating();
    }

    Dog(){
        super();    // Invoked parents class constructor
        System.out.println("Child Constructor < Dog >");
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        Dog dog = new Dog();

        System.out.println("\n**************\n");

        dog.displayColor();

        System.out.println("\n**************\n");

        dog.eating();
    }

}
