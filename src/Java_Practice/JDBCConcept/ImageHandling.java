package Java_Practice.JDBCConcept;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;

public class ImageHandling {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/demodb";
        String userName="root";
        String password="root";
        String imagePath ="C:\\Users\\Deepan behera\\Desktop\\ImageFloderDatabase\\Elephant.jpg";
        String floderPath ="C:\\Users\\Deepan behera\\Desktop\\ImageFloderDatabase\\";
        String imageInsertQuery = "INSERT INTO imageTable(imageData)values(?)";
        String retrieveQuery = "SELECT imageData from imageTable where imageId=?";
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
            FileInputStream fileInputStream = new FileInputStream(imagePath);
            byte[] imageData =new byte[fileInputStream.available()];
            fileInputStream.read(imageData);
            PreparedStatement stmt = con.prepareStatement(imageInsertQuery);
            stmt.setBytes(1,imageData);
            int affectedRows = stmt.executeUpdate();
            if (affectedRows>0){
                System.out.println("Image inserted Successfully");
            }
            else {
                System.out.println("Image not inserted...");
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
