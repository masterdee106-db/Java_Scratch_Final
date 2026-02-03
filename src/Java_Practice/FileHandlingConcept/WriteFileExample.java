package Java_Practice.FileHandlingConcept;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteFileExample {
    public static void main(String[] args) {
        File file = new File("Example.txt");

        try {
            FileWriter writer = new FileWriter(file);
            writer.write("Deepan is a Good Employee...");
            writer.write("I wrote this things using FileWriter Class");
            writer.close();
            System.out.println("File Written Successfully...");
        }
        catch (IOException i){
            i.printStackTrace();
        }
    }
}
