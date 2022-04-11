package readWriteFromFile;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteIntoPropertiesFile {
    public static void main(String[] args) throws IOException {

//        File file=new File("Data/credentials.properties");
//        FileWriter fw=new FileWriter(file);
//        PrintWriter pw=new PrintWriter(fw);
//        pw.write("username = \"Hossain\"\n");
//        pw.write("password = \"miru111\"");

        File file = new File("Data/login.txt");
        FileWriter fw=new FileWriter(file);
        PrintWriter pw=new PrintWriter(fw);
        pw.write("Miru\n");
        pw.write("Hossain");

        pw.close();

    }
}
