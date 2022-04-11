package LearnLoop;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
//        int choice = 3;
//        switch (choice) {
//            case 1:
//                System.out.println("This is 1st statement");
//                break;
//            case 2:
//                System.out.println("This is 2nd statement");
//                break;
//            case 3:
//                System.out.println("This is 3rd statement");
//                break;
//            default:
//                System.out.println("There is no statement");
//                break;
//        }
        Scanner input=new Scanner(System.in);
        System.out.print("Enter you Number : ");
        int choice=input.nextInt();

        switch (choice){
            case 1:
                System.out.println("This is One");
                break;
            case 2:
                System.out.println("This is Two");
                break;
            case 3:
                System.out.println("This is Three");
                break;
            default:
                System.out.println("This is out of bound");
                break;
        }

    }
}
