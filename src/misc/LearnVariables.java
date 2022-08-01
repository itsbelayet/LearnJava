package misc;

public class LearnVariables {

    static int age;

    void testMethod(int ag) {
        this.age = ag;
        System.out.println(this.age);
    }

    public static void main(String[] args) {
        LearnVariables lv = new LearnVariables();
        lv.testMethod(57);

        String a = "ABC", b = "ABC";
        String a1=new String("ABC");

        if (a==a1){
            System.out.println(a+" and "+a1+" is equal");
        }else{
            System.out.println(a+" and "+a1+" is Not equal");
        }

        String a2=new String("ABC").intern();
        if (a==a1){
            System.out.println(a+" and "+a2+" is equal");
        }else{
            System.out.println(a+" and "+a2+" is Not equal");
        }

    }
}
