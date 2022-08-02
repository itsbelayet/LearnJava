package problemSolving.tempPractic;

import java.util.Scanner;

public class Find_Fibonacci {
    public static void main(String[] args) {
        /*
        int fastnumb=0,sendnumb=1,febonumb;
        System.out.print(fastnumb+" , "+sendnumb);
        for (int i=3; i<=20;i++){
            febonumb=fastnumb+sendnumb;
            System.out.print(" , "+febonumb);
            fastnumb=sendnumb;
            sendnumb=febonumb;
        }
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("How many Fibonacci Number you want : ");
        fibonacci(sc.nextInt());
    }

    static void fibonacci(int fibo) {
        int firstnum = 0, secondnum = 1, fibonum;
        System.out.print(firstnum + " , " + secondnum);
        for (int i = 3; i <= fibo; i++) {
            fibonum=firstnum+secondnum;
            System.out.print(" , "+fibonum);
            firstnum=secondnum;
            secondnum=fibonum;
        }

    }

}