package problemSolving;

import java.util.Arrays;

public class PrintArraysElements {
    public static void main(String[] args) {
        String str = "MY name is Mohammed Belayet Hossain";
        String[] arrayStr = str.split(" ");

        String[][] sstrArray={{"Name","Age","Address"},{"Miru","57","Bronx"}};
        int[] intArray = {101, 102, 103, 104, 105};
        int[][] iintArray={{50,60,70},{501,601,701}};

        //Way to print the elements of an Array
        String aaa=Arrays.toString(arrayStr);               // For All Arrays (String & int)
        System.out.println(aaa);
        System.out.println(Arrays.toString(intArray));

        System.out.println(Arrays.asList(arrayStr));        // Only for String Array

        System.out.println(Arrays.deepToString(sstrArray)); // For 2 dimention array
        System.out.println(Arrays.deepToString(iintArray));

    }
}
