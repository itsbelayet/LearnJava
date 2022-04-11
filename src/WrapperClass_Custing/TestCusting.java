package WrapperClass_Custing;

public class TestCusting {
    public static void main(String[] args) {

        // int to double
        int i=57;
        double ii=(double)i;
        double iii=(double)8539;
        System.out.println("int to double : "+ii);
        System.out.println("int to double direct : "+iii);

        // int to String;
        String st=Integer.toString(1147);
        System.out.println("int to String : "+st);

        String sti=String.valueOf(1964);
        System.out.println(sti);

        // String to int
        String val="347";
        int vali=Integer.parseInt(val);
        System.out.println(vali+3);

        System.out.println("*****************");
        double di=(double)89;
        System.out.println("int to double : "+di);

        int si=Integer.parseInt("345");
        System.out.println("String to int : "+si);

        String sval=Integer.toString(888);
        String vals=String.valueOf(999);

        System.out.println("*****************");
        String sint="My name is Miru. My age is 57. I born 1964.";
        String sit=sint.replaceAll("[^0-9]","");
        String ssit=sint.replaceAll("\\D","");

        int it=Integer.parseInt(ssit);
        System.out.println(it+1);

        // Integer.toString(555)    Convert to String
        // String.valueOf(555)      Convert to String

        //Integer.parseInt("555")   Convert to int
        //replaseAll("\\D","")

    }

}
