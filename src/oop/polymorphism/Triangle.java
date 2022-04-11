package oop.polymorphism;

public class Triangle extends Shape {
    int base, hight;

    Triangle(int bas, int hig) {
        base = bas;
        this.hight = hig;
    }

    int area() {
        System.out.print("Area for Triangle : ");
        return base * this.hight;
    }
}
