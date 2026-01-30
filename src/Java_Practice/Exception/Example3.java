package Java_Practice.Exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class FileService{
    public void readFile() throws IOException{
        FileReader fr = new FileReader("C:\\Users\\Deepan behera\\Desktop");
        BufferedReader br = new BufferedReader(fr);
        System.out.println(br.readLine());
        br.close();
    }
}
public class Example3 {
    public static void main(String[] args) {
        FileService fs = new FileService();
        try {
            fs.readFile();
        }
        catch (IOException e){
            System.out.println("File not found error handling...");
        }
    }
}
