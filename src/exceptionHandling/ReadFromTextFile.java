package exceptionHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromTextFile {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Program started\n");
        try {
            FileReader fr = new FileReader("Data/ReadText");
            BufferedReader br=new BufferedReader(fr);
            try {
                System.out.println(br.readLine());
            }catch (IOException e){
                System.out.println("This is IO Exception");
            }
        }catch (FileNotFoundException e){
            System.out.println("This is Catch Block");
        }finally {
            System.out.println("\nThis is Finally block");
        }

        /*
        // Useing try-catch block
        try{
            Thread.sleep(5000);
        }catch (InterruptedException e){
            System.out.println("This is Interruption Exception");
        }*/

        // Useing throws
        Thread.sleep(5000);

        System.out.println("\nProgram closed");

    }
}
