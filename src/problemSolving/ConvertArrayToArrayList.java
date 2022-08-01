package problemSolving;

import java.util.*;

public class ConvertArrayToArrayList {
    public static void main(String[] args) {

        String[] arrElement = {"Red", "Blue", "Green","Black","White"};
        int [] intArray={101,301,501,401,201};

        ArrayList <Integer> intList=new ArrayList();
        for (int in:intArray) {
            intList.add(in);
        }
        System.out.println(intList);

        System.out.println("Useing toString Method : "+Arrays.toString(arrElement)+"\n");

        ArrayList list=new ArrayList();
        list.addAll(Arrays.asList(arrElement));
        System.out.println("Useing asList Method : "+list+"\n");

        List list1=new ArrayList();
        Collections.addAll(list1,arrElement);
        System.out.println("Useing addAll Method : "+list1+"\n");

        List list2=new ArrayList();
        for (String ae:arrElement){
            list2.add(ae);
        }
        System.out.println("Useing for Each Method : "+list2+"\n");

    }
}
