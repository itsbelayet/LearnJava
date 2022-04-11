package learn_Variable;

public class Vehicle {
    Vehicle(){
        System.out.println("This is Vehicle");
    }
}

class Car extends Vehicle{
    Car(){
        super();		                    // Print “This is Vehicle”
        System.out.println("This is car");	// Print “This is Car”
    }

    public static void main(String[] args) {
        new Car();
    }
}
