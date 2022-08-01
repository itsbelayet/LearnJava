package problemSolving;


public class TestExample {
    public static void main(String[] args) {
        int firstnum = 0, secondnum = 1, fibo;
        System.out.print(firstnum + " , " + secondnum);
        for (int i = 2; i < 10; i++) {
            fibo = firstnum + secondnum;
            System.out.print(" , " + fibo);
            firstnum = secondnum;
            secondnum = fibo;
        }
    }
}


