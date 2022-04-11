package problemSolving;

public class FactorialNumber {

    // Factorial of 0 = 1
    // Factorial of 1 = 1
    // Factorial of 3 = 3*2*1 = 6
    // Factorial of 4 = 4*3*2*1 = 24
    // Factorial of 5 = 5*4*3*2*1= 120
    // Factorial of 10 = 10*9*8*7 ... *1

    public static void main(String[] args) {
        System.out.println("Factorial 5 is: "+fact1(5));
        System.out.println("Factorial 1 is: "+fact1(1));
        System.out.println("Factorial 0 is: "+fact1(0));
        System.out.println("Factorial 0 is: "+fact1(4));
    }
    // Without recursive use for loop
    public static int fact1(int num){
        int fact=1;
        if (num==0){
            return fact;
        }else{
            for(int i=1;i<=num;i++){
                fact=fact*i;
            }
        }
        return fact;
    }

    // With Recursive Function (function calling itself)
    public static int fact2(int num){
        if (num==0)
            return 1;
        else
            return (num * fact2(num-1));
    }


}
