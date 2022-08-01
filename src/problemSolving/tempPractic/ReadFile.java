package problemSolving.tempPractic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        readTextFile();
    }
    public static void readTextFile() throws IOException {
        FileReader fr=new FileReader("Data/Out.txt");
        BufferedReader br=new BufferedReader(fr);
        String text;
        while ((text=br.readLine())!=null){
            System.out.println(text);
        }
    }

}
