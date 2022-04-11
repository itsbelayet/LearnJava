package misc;

public class LearnVariables {

    static int age;

    void testMethod(int ag){
        this.age=ag;
        System.out.println(this.age);
    }

    public static void main(String[] args) {
        LearnVariables lv=new LearnVariables();
        lv.testMethod(57);
    }
}
