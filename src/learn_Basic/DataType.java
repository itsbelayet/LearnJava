package learn_Basic;

public class DataType {
    String name="Miru";
    static String add="Bangladesh",country;
    static int age;
    void testString(){
        System.out.println(this.name);      // non-static variable can call with this keyword
        System.out.println(DataType.add);   // static variable call with class name
    }
    public static void main(String[] args) {
        System.out.println(country);    // print null
        System.out.println(age);        // print 0

        DataType dt=new DataType();
        dt.testString();

        //byte 8 bit
        byte bt1=70,bt2=10;
        System.out.println(bt1+bt2+"\n");

        //int 32 bit
        int it1=400,it2=50;
        System.out.println(it1+bt1+"\n");

        //float 32 bit
        float fl1=5.13f, fl2=1.33f;     // f should mention
        System.out.println(fl1+it2+"\n");

        //long 64 bit
        long lng1=546464654l,lng2=545765;
        System.out.println(lng1+lng2+"\n");

        //double 64 bit
        double dob1=4.587d,dob2=587.9527;
        System.out.println(dob1+dob2);
    }
}
