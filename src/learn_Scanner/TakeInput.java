package learn_Scanner;

import java.util.Scanner;

public class TakeInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        System.out.print("Enter your First Name : ");
//        String fname=sc.next();        // .next() for Single word
//        System.out.println(fname);

        System.out.print("Enter your Full Name : ");
        String fullname=sc.nextLine();  // .nextLine() for Multi words
        System.out.println(fullname);

        System.out.print("Enter your Age : ");
        int age=sc.nextInt();           // .nextInt() for int
        System.out.println(age);

        sc.close();
    }
}
