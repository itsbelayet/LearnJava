package problemSolving;

public class PrimeNumber {
    public static void main(String[] args) {
        int num = 20;
        boolean status = false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                status = true;
                break;
            }
        }
        if (status == true) {
            System.out.println(num + " is not Prime Number");
        } else {
            System.out.println(num + " is Prime Number");
        }
    }
}
