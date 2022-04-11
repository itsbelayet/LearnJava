package readWriteFromFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("Data/credentials.properties");
        Properties prop = new Properties();
        prop.load(fis);

        System.out.println("User Name : " + prop.getProperty("username"));
        System.out.println("Password  : " + prop.getProperty("password"));

    }

}
