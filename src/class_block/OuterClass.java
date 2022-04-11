package class_block;

public class OuterClass {

    String name = "Outer Class";

    private class InnerClass{
        void innerClassMethod(){
            System.out.println("This is Private Inner Class");
        }
    }

    void outerMethod(){
        InnerClass ic=new InnerClass();
        ic.innerClassMethod();
    }
}
class RunClass{
    public static void main(String[] args) {
        OuterClass oc=new OuterClass();
        oc.outerMethod();
    }
}
