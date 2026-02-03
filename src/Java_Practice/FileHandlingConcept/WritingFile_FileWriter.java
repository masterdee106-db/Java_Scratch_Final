package Java_Practice.FileHandlingConcept;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingFile_FileWriter {
    public static void main(String[] args) {

        try {
            File file = new File("Example.txt");
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
                    writer .write("Hello");
                    writer.newLine();
                    writer.write("Good Morning");
                    writer.newLine();
                    writer.write("have a great! day");
                    writer.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

}
