package learn_Collection;

import java.util.ArrayList;
import java.util.Collections;

public class Learn_ArrayList {
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        al.add("X");
        al.add("A");
        al.add("Y");
        al.add("C");
        al.add("Z");
        al.add("B");

        Collections.sort(al);
        System.out.println("After sort : "+al);

        Collections.shuffle(al);
        System.out.println("After Shuffle : "+al);

        Collections.sort(al,Collections.reverseOrder());
        System.out.println("After Reverse Sort : "+al);

    }
}
