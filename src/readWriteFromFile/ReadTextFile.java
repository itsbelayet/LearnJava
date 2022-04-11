package readWriteFromFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFile {

    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("Data/Out.txt");
        BufferedReader br = new BufferedReader(fr);
        String text;
        while ((text = br.readLine()) != null) {
            System.out.println(text);
        }

        // 2nd approach
//        FileReader fr=new FileReader("Data/credentials.properties");
//        BufferedReader br=new BufferedReader(fr);
//        String text;
//        while ((text=br.readLine())!=null){
//            System.out.println(text);
//        }

        // 3rd approach
//        FileReader fr = new FileReader("Data/Out.txt");
//        BufferedReader br = new BufferedReader(fr);
//        do{
//            System.out.println(br.readLine());
//        }while (br.readLine()!=null);

    }

}
