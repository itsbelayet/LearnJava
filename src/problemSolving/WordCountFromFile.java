package problemSolving;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class WordCountFromFile {
    public static void main(String[] args) throws IOException {
        wordCount();
    }

    static void wordCount() throws IOException {
        FileReader fr = new FileReader("Data/ReadText");
        BufferedReader br = new BufferedReader(fr);

        int totWord = 0;
        String txt;
        while ((txt = br.readLine()) != null) {
            totWord = totWord + txt.split(" ").length;
            System.out.println(txt);
        }
        System.out.println("Total Word is : "+totWord);
    }


}
