package Java_Practice.JDBCConcept.PreparedStatementConcept;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
            pstmt.setInt(1, 7);
            pstmt.setString(2, "Anurag");
            pstmt.setString(3, "SAP");
            pstmt.setString(4, "45000.230");

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
