package Java_Practice.FileHandlingConcept;

import java.io.*;

public class FileHandlingExample {
    public static void main(String[] args) {
        File path = new File("RawFile.txt");
        System.out.println(path.exists());
        // Below the code shows how to write in a file
        try {
            FileWriter writer = new FileWriter(path);
            writer.write("Deepan is a good boy");
            writer.close();
        }
        catch (IOException i){
            i.printStackTrace();
        }

        // Below code shows that how to read the data from the file...
        try {
            BufferedReader reader = new BufferedReader(new FileReader("RawFile.txt"));
            String line = reader.readLine();
            System.out.println(line);
            reader.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
