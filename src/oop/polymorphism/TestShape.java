package oop.polymorphism;

public class TestShape {
    public static void main(String[] args) {
        Shape s = new Shape();
        Rectangle r = new Rectangle(2, 5);
        Triangle t = new Triangle(20, 50);

        System.out.println(s.area());
        System.out.println(r.area());
        System.out.println(t.area());
    }
}
