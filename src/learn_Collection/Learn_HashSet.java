package learn_Collection;

import java.util.HashSet;

public class Learn_HashSet {
    public static void main(String[] args) {
        HashSet hs1 = new HashSet();
        hs1.add("A");
        hs1.add("B");
        hs1.add("C");
        hs1.add("D");
        hs1.add("E");
        System.out.println("HashSet 1 : "+hs1);

        HashSet hs2 =new HashSet();
        hs2.add("D");
        hs2.add("E");
        hs2.add("F");
        System.out.println("HashSet 2 : "+hs2);

        // Union two HashSet
//        hs1.addAll(hs2);
//        System.out.println("After Union : "+hs1);

        // Intersection two HashSet (Common Elements)
//        hs1.retainAll(hs2);
//        System.out.println("Common Elements : "+hs1);

        // Difference between two HashSet
        hs1.removeAll(hs2);
        System.out.println("After remove All : "+hs1);
    }
}
