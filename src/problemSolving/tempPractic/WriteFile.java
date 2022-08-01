package problemSolving.tempPractic;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

//import static problemSolving.tempPractic.ReadFile.readTextFile;

public class WriteFile extends ReadFile{
    public static void main(String[] args) throws IOException {
        writeTextFile();
        readTextFile();
    }

    public static void writeTextFile() throws IOException {
        File file =new File("Data/Out.txt");
        FileWriter fw=new FileWriter(file);
        PrintWriter pw=new PrintWriter(fw);
        pw.write("Hi, My Name is Miru\n");
        pw.write("My daughter name is Rodoshi\n");
        pw.write("We live in New York\n");
        pw.write("Bye bye");
        pw.close();
        fw.close();
    }

}
