package problemSolving;

import java.util.Arrays;

public class Anagram_Check {
    public static void main(String[] args) {
        String str1 = "CAT", str2 = "ACT";
        boolean status = false;
        if (str1.length() != str2.length()) {
            status = false;
        } else {
            char[] cst1 = str1.toUpperCase().toCharArray();
            char[] cst2 = str2.toUpperCase().toCharArray();
            Arrays.sort(cst1);
            Arrays.sort(cst2);
            if (Arrays.equals(cst1, cst2)) {
                status = true;
            }
        }
        if (status == true) {
            System.out.println(str1+" & "+str2+" are "+"Anagram");
        } else {
            System.out.println(str1+" & "+str2+" are "+"Not a Anagram");
        }
    }
}
