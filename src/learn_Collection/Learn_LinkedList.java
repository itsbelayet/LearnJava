package learn_Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Learn_LinkedList {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();

        list.add("X");
        list.add("A");
        list.add("Y");
        list.add("C");
        list.add("Z");
        list.add("B");
        System.out.println(list);

        list.addFirst("M");
        list.addLast("S");
        System.out.println(list);

        list.removeFirst();
        list.removeLast();
        System.out.println(list);

//        Collections.sort(list);
//        System.out.println("After sort : "+list);
//        Collections.shuffle(list);
//        System.out.println("After Shuffle : "+list);
//        Collections.sort(list,Collections.reverseOrder());
//        System.out.println("After Reverse Sort : "+list);

    }
}
