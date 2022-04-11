package WrapperClass_Custing;

public class Custing {
    public static void main(String[] args) {

        // Type custing
        System.out.println("Type Custing :");
        int salary=57;
        double dsalary=(double) salary;
        System.out.println("Intger Salary :"+salary+" Double Salary :"+dsalary);

        // Convert data
        System.out.println("Converting Date");
        String age ="57";                   // int to String
        int iage=Integer.parseInt(age);
        System.out.println("Convert String to int : Before = "+age+" After : "+iage);

        String sage=String.valueOf(iage);   // String to int
        System.out.println("Convert int to String : Before = "+iage+" After : "+sage);

        // Wrapper Class

        int year=1964;
        System.out.println("Wrapper Class :");
        Integer iyear=new Integer(year);    // Wrappering
        Integer ayear=year;                 // Auto Boxing
        System.out.println("Convert int to Integer Object : Before = "+year+" After : "+iyear);

        int uyear=ayear.intValue();
        int ryear=ayear;                    // Auto Un-Boxing
        System.out.println("Convert Integer Object to int : Before = "+uyear+" After : "+ryear);

    }
}
