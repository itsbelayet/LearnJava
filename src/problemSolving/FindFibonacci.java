package problemSolving;

public class FindFibonacci {
    public static void main(String[] args) {
        int firstNum=0,secontNum=1,fibonaci;
        System.out.print (firstNum+", "+secontNum);
        for (int i=3; i<=10; i++){
            fibonaci=firstNum+secontNum;
            System.out.print(", "+fibonaci);
            firstNum=secontNum;
            secontNum=fibonaci;
        }
    }
}
