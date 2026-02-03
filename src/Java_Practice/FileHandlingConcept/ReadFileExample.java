package Java_Practice.FileHandlingConcept;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileExample {
    public static void main(String[] args) {

        try {
            File file = new File("Example.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line ;
            while ((line=reader.readLine())!=null){
                System.out.println(line);
            }
            reader.close();

//            String line=reader.readLine();
//            System.out.println(line);
//            reader.close();
        }


        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

}
