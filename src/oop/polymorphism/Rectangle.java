package oop.polymorphism;

public class Rectangle extends Shape {
    int length, width;

    Rectangle(int len, int wid) {
        length = len;
        this.width = wid;
    }

    int area() {
        System.out.print("Area for Rectangle : ");
        return length * width;
    }
}
