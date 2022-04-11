package WrapperClass_Custing;

public class Learn_WrapperClass {
    public static void main(String[] args) {
        int i=57;                   // Primitive datatype
        Integer ii=new Integer(i);  // Boxing or Wrapping
        Integer value=i;            // AutoBoxing or Auto Wrapping

        int j=ii.intValue();        // UnBoxing or Un-Wrapping
        int k=value;                // Auto Un-Boxing or Auto Un-Wrapping

        System.out.println("Object : "+value);
        System.out.println("Primitive : "+k);

    }
}
