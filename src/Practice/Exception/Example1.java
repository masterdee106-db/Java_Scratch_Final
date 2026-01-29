package Practice.Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Example1 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("deepan.txt");
            System.out.println("File Opened successfully....");
        }
        catch(FileNotFoundException fe){
            System.out.println("File not found at this place please check the path...");
        }
    }
}
