package problemSolving;

import java.util.HashMap;
import java.util.Map;

public class CountDuplicateCharacterFromArray_UseingHashMap {
    public static void main(String[] args) {
        int[] arr = {355, 655, 677};
        countElementsInt(arr);
        System.out.println("***********************");
        String[] srr = {"Belayet","Hossain","Miru"};
        countElementsStr(srr);
    }
        static void countElementsInt(int[] arr){
            HashMap<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < arr.length; i++) {
                char[] chr = String.valueOf(arr[i]).toCharArray();
                for (int j = 0; j < chr.length; j++) {
                    if (map.containsKey(chr[j])) {
                        map.put(chr[j], map.get(chr[j]) + 1);
                    } else {
                        map.put(chr[j], 1);
                    }
                }
            }
            //System.out.println(map);
            for (Map.Entry<Character, Integer> maplist : map.entrySet()) {
                System.out.println(maplist);
            }
        }
    static void countElementsStr(String[] srr) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < srr.length; i++) {
            char[] chr = srr[i].toCharArray();
            for (int j = 0; j < chr.length; j++) {
                if (map.containsKey(chr[j])){
                    map.put(chr[j], map.get(chr[j])+1);
                }else {
                    map.put(chr[j],1);
                }
            }
        }
        for (Map.Entry<Character, Integer>maplist:map.entrySet()){
            System.out.println(maplist);
        }
    }
}
