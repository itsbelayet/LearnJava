package learn_String;

public class ReverseString {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("My name is Miru");
        System.out.println(sb.reverse());
        // or
        String revst = sb.toString();
        System.out.println(revst);
    /*
        String name="Belayet";
        StringBuffer sb=new StringBuffer(name);
        System.out.println(sb.reverse());
        System.out.println(sb.toString());
     */

    }
}
