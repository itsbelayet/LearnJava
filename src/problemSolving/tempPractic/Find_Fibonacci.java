package problemSolving.tempPractic;

public class Find_Fibonacci {
    public static void main(String[] args) {
        int fastnumb=0,sendnumb=1,febonumb;
        System.out.print(fastnumb+" , "+sendnumb);
        for (int i=3; i<=20;i++){
            febonumb=fastnumb+sendnumb;
            System.out.print(" , "+febonumb);
            fastnumb=sendnumb;
            sendnumb=febonumb;
        }
    }
}