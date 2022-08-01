package learn_Arrays;

import java.util.Arrays;

public class Print_Arrays_Elements {
    public static void main(String[] args) {

        String[] st = {"D", "Z", "C", "A", "Y", "B", "X",};
        int [] intArray={5,9,6,4,2};
        String[][] twodArray={{"Name","Age","Add"},{"Miru","57","Bronx"}};

        // 1st way to print
        System.out.println("*** Useing for Loop ***");
        for (int i = 0; i < st.length; i++) {
            System.out.println(st[i]);
        }

        // 2nd way to print
        System.out.println("*** Useing for each Loop ***");
        for (String s : st) {
            System.out.println(s);
        }

        // 3rd way to print
        System.out.println("*** Useing Arrays.asList Method ***");
        System.out.println(Arrays.asList(st));       // This method used only for String Objects
//        System.out.println(Arrays.asList(intArray)); // will not work

        // 4th way to print
        System.out.println("*** Useing toString Method ***");
        System.out.println(Arrays.toString(st));
        System.out.println(Arrays.toString(intArray));

        // 5th way to print
        System.out.println("*** Useing deepToString Method Only for Multi Dimention Arrays ***");
        System.out.println(Arrays.deepToString(twodArray));

    }
}
