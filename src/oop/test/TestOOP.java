package oop.test;

public class TestOOP extends LearnAbstrac {


    @Override
    public void learnMethod(String name) {
        System.out.println(name);
    }

    @Override
    public void learnMethod(String name, int age) {
        System.out.println(name+"  "+age);
    }

    public static void main(String[] args) {
        TestOOP to=new TestOOP();
        to.learnMethod("Belayet");
        to.learnMethod("Hossain",57);
    }
}
