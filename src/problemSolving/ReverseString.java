package problemSolving;

public class ReverseString {
    public static void main(String[] args) {
        String str="My name is Mohammed Belayet Hossain";
        String[] arr=str.split(" ");
        String revArr="";

        for(String st:arr){
            StringBuffer sb=new StringBuffer(st);
            revArr=revArr+sb.reverse()+" ";
        }
        System.out.println(revArr);
    }
}
