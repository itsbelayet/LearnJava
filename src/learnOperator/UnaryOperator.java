package learnOperator;

public class UnaryOperator {
    public static void main(String[] args) {
        int num=10;
        System.out.println(num++);  //10
        System.out.println(++num);  //12
        System.out.println(num++);  //12
        System.out.println(num++);  //13
        System.out.println(++num);  //15

        num--;  //15
        num--;  //14
        num++;  //13
        --num;  //13
        num++;  //13
        System.out.println(num);    //14

    }
}
