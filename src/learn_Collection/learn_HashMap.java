package learn_Collection;

import java.util.HashMap;

public class learn_HashMap {
    /*
        1. HasMap is a class implemented Map Interface
        2. Insertion order not present
        3. Duplicate keys not allow
        4. Duplicate value allow
        5. Null key allow one time
        6. Null value allow allow
        7. Searching operation faster
     */
    public static void main(String[] args) {

        HashMap<Integer, String> mh = new HashMap<>();  // Declare HashMap
        mh.put(11, "Zakir");
        mh.put(12, "Belayet");
        mh.put(13, "Ismat");

        HashMap hm = new HashMap();                     // Declare HashMap
        hm.put(102, "Miru");
        hm.put(103, "Miru");
        hm.put(105, "Rekha");
        hm.put(107, "Hossain");
        hm.put(107, "Mohammed");
        hm.put(109, "Hiru");

        for (Object i : hm.entrySet()) {      // .entrySet()
            System.out.println(i);
        }

        System.out.println(hm.get(107));        // Return value "Mohammed"
        System.out.println(hm.remove(109)); // Remove key and value

        for (Object i : hm.entrySet()) {      // Print All
            System.out.println(i);
        }

        hm.putAll(mh);                      // Add another HashMap set

        for (Object i : hm.entrySet()) {      // Print All
            System.out.println(i);
        }

        System.out.println(hm.containsKey(103));        // Check Key is present or not
        System.out.println(hm.containsValue("Miru"));   // Check Value is present or not
        System.out.println(hm.isEmpty());               // Check Empty or not
        System.out.println(hm.size());                  // Return Size

        //hm.clear();                                     // Clear all

        System.out.println(hm.keySet());                // Return only key list
        System.out.println(hm.values());                // Return only value list
        System.out.println(hm.entrySet());              // Return all key value list

//        for (Object i : hm.entrySet()) {      // Print All
//            System.out.println(i);
//        }
    }
}
