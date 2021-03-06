package readWriteFromFile;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteIntoTextFile {

    public static void main(String[] args) throws IOException {
        // 1st Step
        File file=new File("Data/Out.txt");

        // 2nd Step
        FileWriter fw=new FileWriter(file);

        // 3rd Step
        PrintWriter pw=new PrintWriter(fw);

        // One approach
        pw.write("My name is Mohammed Hossain\n");
        pw.write("I live in New York\n");
        pw.write("I come from Bangladesh");

        // 2nd approach
//        for (int i=0; i<10;i++){
//            pw.println("Line - "+i+" : I am Belayet Hossain");
//        }
        pw.close();

    }

}
