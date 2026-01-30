package Java_Practice.JDBCConcept;



import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.*;

public class ImageHandling2 {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/demodb";
        String userName="root";
        String password="root";
//        String imagePath ="C:\\Users\\Deepan behera\\Desktop\\ImageFloderDatabase\\Elephant.jpg";
        String floderPath ="C:\\Users\\Deepan behera\\Desktop\\ImageFloderDatabase\\";
//        String imageInsertQuery = "INSERT INTO imageTable(imageData)values(?)";
        String retrieveQuery = "SELECT imageData from imageTable where imageId=(?)";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded successfully...");
        }
        catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
            System.out.println("Failed to laod....");
        }

        try {
            Connection con= DriverManager.getConnection(url, userName, password);
            System.out.println("Connection Successful..");
            PreparedStatement preparedStatement = con.prepareStatement(retrieveQuery);
            preparedStatement.setInt(1,1);
            ResultSet resultSet=preparedStatement.executeQuery();
            if (resultSet.next()){
                byte[] imageData=resultSet.getBytes("imageData");
                String imagePath=floderPath+"extractedImage.jpg";
                OutputStream outputStream = new FileOutputStream(imagePath);
                outputStream.write(imageData);
                System.out.println("Image loaded successfuly...");
            }
            else {
                System.out.println("Image Not found...");
            }

        }
        catch (SQLException e){
            System.out.println(e.getMessage());
            System.out.println("Failed to connect...");
        } catch (RuntimeException r){
            throw  new RuntimeException(r);
        } catch (IOException i){
            throw  new RuntimeException(i);
        }

    }
}
