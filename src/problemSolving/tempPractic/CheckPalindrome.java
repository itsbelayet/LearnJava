package problemSolving.tempPractic;

public class CheckPalindrome {
    public static void main(String[] args) {
        String text1="madam",text2="";
        for (int i=text1.length()-1; i>=0; i--){
            text2=text2 + text1.charAt(i);
        }
        if (text1.equals(text2)){
            System.out.println("Its Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }
    }
}
