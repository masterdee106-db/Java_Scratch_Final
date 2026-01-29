package Practice.Exception;

import java.io.FileReader;
import java.io.IOException;

class ReportService{
    public void generateReport() throws IOException, InterruptedException{
        FileReader fr = new FileReader("C:\\Users\\Deepan behera\\Desktop");
        Thread.sleep(2000);
        System.out.println("Report generated...");
    }
}
public class Example4 {
    public static void main(String[] args) {

        ReportService rs = new ReportService();
        try {
            rs.generateReport();
        }
        catch(IOException e){
            System.out.println("File issue occured...");
        }
        catch (InterruptedException i){
            System.out.println("Thread Inturrupted...");
        }
    }
}
