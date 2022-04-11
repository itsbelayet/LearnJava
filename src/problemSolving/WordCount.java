package problemSolving;

public class WordCount {
    public static void main(String[] args) {
        String text = "My name is Mohammed Belayet Hossain.";
        int totWord = text.split(" ").length;
        System.out.println("Total Words is : " + totWord);
    }

}
