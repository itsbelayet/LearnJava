package exceptionHandling;

public class UncheckException {

    public static void main(String[] args) {

        System.out.println("Program Started");
        int a=50;
        try{
            System.out.println(a/0);
        }catch (ArithmeticException e){
            System.out.println("This is Catch Block");
        }catch (NullPointerException e){
            System.out.println("This is Catch Block");
        }catch (Exception e){
            System.out.println("This is Catch Block");
        }finally {
            System.out.println("This is Finally Block");
        }

        System.out.println("Program Close");
    }
}
