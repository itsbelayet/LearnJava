package learn_Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Learn_Itarator {
    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>();
        str.add("Miru");
        str.add("Hiru");
        str.add("Rekha");
        str.add("Moni");

        System.out.println(str+"\n");

        System.out.println("\n******* Useing Iterator *******\n");

        Iterator it = str.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("\n******* Useing for each Loop *******\n");

        for (String st:str) {
            System.out.println(st);
        }

        System.out.println("\n******* Useing Map *******\n");

        Map<Integer,String> map=new HashMap();
        map.put(11,"Miru");
        map.put(21,"Hiru");
        map.put(31,"Rekha");
        map.put(41,"Moni");

        Iterator mapit=map.entrySet().iterator();
        while (mapit.hasNext()){
            System.out.println(mapit.next());
        }
    }
}
