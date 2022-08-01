package problemSolving;

public class Palindrome_Check {
    public static void main(String[] args) {

        String text = "madam", rtext = "";

        //1st Approach
//        for (int i = text.length() - 1; i >= 0; i--) {
//            rtext = rtext + text.charAt(i);
//        }
//        if (text.equals(rtext)) {
//            System.out.println(text+" is "+"Palindrome");
//        } else {
//            System.out.println(text+" is "+"Not Palindrome");
//        }

        //2nd Approach
        StringBuffer sb=new StringBuffer(text);
        rtext=sb.reverse().toString();
        if (text.equals(rtext)){
            System.out.println(text+" is "+"Palindrome");
        }else{
            System.out.println(text+" is "+"Not Palindrome");
        }
    }
}
