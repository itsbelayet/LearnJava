package learn_Collection;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class learn_TreeMap {
    /*
        Store data as sorted

    */
    public static void main(String[] args) {

        TreeMap tm=new TreeMap();                     // for Ascending order
        //TreeMap <Integer, String> tm=new TreeMap<>(); // for Descending order
        //TreeMap tm=new TreeMap(Comparator.reverseOrder());

        tm.put(300,"Tom");
        tm.put(100,"Jami");
        tm.put(200,"Peter");
        tm.put(800,"Naveen");
        tm.put(500,"Robby");

        System.out.println(tm);
        for (Object ob: tm.entrySet()) {
            System.out.println(ob);
        }
        System.out.println("\n*******************\n");
//        System.out.println(tm.lastKey());
//        System.out.println(tm.lastEntry());
//
//        System.out.println(tm.firstKey());
//        System.out.println(tm.firstEntry());

        Set lt=tm.headMap(300).entrySet();
        System.out.println(lt);

        Set gt=tm.tailMap(300).entrySet();
        System.out.println(gt);

    }
}
