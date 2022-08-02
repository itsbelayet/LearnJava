package problemSolving.tempPractic;

import java.util.Arrays;

public class CheckAnagram {

    public static void main(String[] args) {
        /*
        String st1="CAT",st2="Cta";
        boolean st; //=false;
        if (st1.length()!=st2.length()){
            st=false;
        }else{
            char[] cst1=st1.toUpperCase().toCharArray();
            char[] cst2=st2.toUpperCase().toCharArray();

            Arrays.sort(cst1);
            Arrays.sort(cst2);
            st=Arrays.equals(cst1,cst2);
        }
        if (st==true){
            System.out.println("It is Anagram");
        }else {
            System.out.println("Not Anagram");
        }
        */
        anogram("CAT","CTE");
    }

    static void anogram(String st1, String st2){
        boolean status;
        if (st1.length()!= st2.length()){
            status=false;
        }else {
            char[] stcar1=st1.toUpperCase().toCharArray();
            char[] stcar2=st2.toUpperCase().toCharArray();
            Arrays.sort(stcar1);
            Arrays.sort(stcar2);
            status=Arrays.equals(stcar1,stcar2);
        }
        if (status==true){
            System.out.printf("Anagram");
        }else {
            System.out.printf("Not Anagram");
        }
    }
}
