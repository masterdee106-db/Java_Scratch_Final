package Java_Practice.Exception;

import java.io.FileReader;
import java.io.IOException;

public class Example2 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("C:\\Users\\Deepan behera\\Desktop");
            fr.read();
            fr.close();
        }
        catch (IOException e){
            System.out.println("I/O Error occured while reading the file... ");
        }
    }
}
