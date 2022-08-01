package problemSolving;

import java.util.HashSet;

public class FindDuplicateElements {
    public static void main(String[] args) {

        String[] arrElement = {"Miru", "Moni", "Rekha", "Moni", "Hiru","Miru"};
        boolean status = false;

        // 1st Approach
//        for (int i = 0; i < arrElement.length; i++) {
//            for (int j = i + 1; j < arrElement.length; j++) {
//                if (arrElement[i] == arrElement[j]) {
//                    System.out.println("Found Duplicate Element : " + arrElement[i]);
//                    status = true;
//                }
//            }
//        }
//        if (status == false) {
//            System.out.println("Duplicate Elements not Found");
//        }

        // 2nd Approach
        HashSet<String> elements = new HashSet<>();
        for (String el : arrElement) {
            if (elements.add(el) == false) {
                System.out.println("Duplicate Element Found : " + el);
                status = true;
            }
        }
        if (status == false) System.out.println("Duplicate Not Found");
    }

}
