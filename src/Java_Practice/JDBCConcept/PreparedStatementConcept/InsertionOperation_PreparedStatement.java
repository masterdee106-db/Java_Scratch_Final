package Java_Practice.JDBCConcept.PreparedStatementConcept;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertionOperation_PreparedStatement {
    public static void main(String[] args) {

        String url="jdbc:mysql://localhost:3306/Students";
        String userName="root";
        String password="root";
        String insertQuery = "INSERT INTO Student(studentId, name, domain, annualFees)VALUES(?, ?, ?, ?)";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded successfully...");
        }
        catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
            System.out.println("Failed to laod....");
        }

        try{
            Connection con = DriverManager.getConnection(url, userName, password);
            System.out.println("Connection successfull....");
            PreparedStatement pstmt = con.prepareStatement(insertQuery);
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the new studentId: ");
            int id=sc.nextInt();
            System.out.println("Enter the Student Name: ");
            String name=sc.next();
            System.out.println("Enter the domain: ");
            String domain=sc.next();
            System.out.println("Enter the annualFees: ");
            float donation=sc.nextFloat();

            pstmt.setInt(1, id);
            pstmt.setString(2, name);
            pstmt.setString(3, domain);
            pstmt.setFloat(4, donation);

            int rows = pstmt.executeUpdate();
            if (rows>0){
                System.out.println("Data Inserted: "+rows+" row(s) affected");
            }
            else {
                System.out.println("Failed to insert");
            }

        }
        catch (SQLException e){
            System.out.println(e.getMessage());
            System.out.println("Failed to connect...");
        }
    }
}
