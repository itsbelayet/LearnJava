package LearnLoop;

public class IfElse {
    public static void main(String[] args) {
        System.out.println("Mohammed B Hossain");
        int a = 10, b = 10;
        String x = "abc";
        String y = new String("abc");

        if (a < 5) {
            System.out.println("It is less then five");
        } else if (a > 5 && a < 7) {
            System.out.println("It is between 5-7");
        } else if (a > 7) {
            System.out.println("It is greten then 7");
        }

        if (a == b) {
            System.out.println("a = b");
        } else {
            System.out.println("a # b");
        }

        System.out.println(x+" = "+y);
        if (x == y) {
            System.out.println("x = y");
        } else {
            System.out.println("x # y");
        }
    }
}
