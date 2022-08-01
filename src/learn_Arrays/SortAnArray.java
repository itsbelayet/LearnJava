package learn_Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class SortAnArray {
    public static void main(String[] args) {
        String[] st = {"D", "Z", "C", "A", "Y", "B", "X",};
        int [] intArray={5,9,6,4,2};
        String[][] twodArray={{"Name","Age","Add"},{"Miru","57","Bronx"}};

        Arrays.sort(st);
        Arrays.sort(intArray);

        for (String s:st) {
            System.out.println(s);
        }
        System.out.println(Arrays.toString(intArray)) ;
    }
}
