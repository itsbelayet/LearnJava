package problemSolving;

public class CountDuplicateCharacterFromString {
    public static void main(String[] args) {

        // Not completed



        //countDuplicateCharacter("miruim");
    }

    static void countDuplicateCharacter(String text) {
        char[] arrText = text.toCharArray();
        for (int i = 0; i < arrText.length; i++) {
            int count=1;
            for (int j=i+1;j<arrText.length;j++){
                if(arrText[i]==arrText[j]){
                    count++;
                }else{
                    break;
                }
            }
            if (count>1){
                System.out.println("Character "+arrText[i]+" Occurs : "+count);
                i+=(count-1);
            }
        }
    }

    /*
    //    static void countElementsStr(String[] srr) {
//        HashMap<Character, Integer> map = new HashMap<>();
//        for (int i = 0; i < srr.length; i++) {
//            char[] chr = srr[i].toCharArray();
//            for (int j = 0; j < chr.length; j++) {
//                if (map.containsKey(chr[j])){
//                    map.put(chr[j], map.get(chr[j])+1);
//                }else {
//                    map.put(chr[j],1);
//                }
//            }
//        }
//        for (Map.Entry<Character, Integer>maplist:map.entrySet()){
//            System.out.println(maplist);
//        }
//
//    }
     */

}
