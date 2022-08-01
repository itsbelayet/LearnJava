package problemSolving.tempPractic;

import java.util.ArrayList;
import java.util.List;

public class FindPrimeNumber {
    public static void main(String[] args) {
        int pnum=25;
//        boolean st=false;
//        for (int i=2;i<pnum; i++){
//            if(pnum%i==0){
//                st=true;
//                break;
//            }
//        }
//        if (st==true){
//            System.out.println("Not Prime Number");
//        }else {
//            System.out.println("It's Prime Number");
//        }

        // Another approach
        List<Integer> primeNum=new ArrayList<>();
        for (int i=2; i<=pnum; i++){
            boolean isPrime=true;
            for (int j=2; j<=i/2; j++ ){
                if (i%j==0){
                    isPrime=false;
                    break;
                }
            }
            if (isPrime){
                primeNum.add(i);
            }
        }
        System.out.println("Prime Number are : ");
        for (int num:primeNum){
            System.out.println(num);
        }
    }
}
