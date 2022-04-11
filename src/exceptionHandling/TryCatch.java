package exceptionHandling;

public class TryCatch {
    public static void main(String[] args) {

        System.out.println("Program Started");
        int a=50;
        try{
            System.out.println(a/0);

//        }catch (Exception e){             // without catch try can work
//            System.out.println(e);
//            System.out.println("This is Catch Block");

        }finally {
            System.out.println("This is Finally Block");
        }
        System.out.println("Program Close");

    }
}
