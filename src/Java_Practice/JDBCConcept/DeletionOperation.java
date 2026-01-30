package Java_Practice.JDBCConcept;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeletionOperation {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/Students";
        String userName="root";
        String password="root";
//        String ReadQuery = "select * from Student;";
//        String insertQuery = "INSERT INTO Student(studentId, name, domain, annualFees) VALUES(6, 'Gautam', 'Cyber Security', '97000.0')";
        String deletionQuery = "DELETE FROM Student WHERE studentId=4;";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver Loaded Successfully...");
        }
        catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

        try {
            Connection con = DriverManager.getConnection(url, userName, password);
            System.out.println("Connection Established Successfully...");
            Statement stmt = con.createStatement();
            int rows=stmt.executeUpdate(deletionQuery);

            if (rows>0){
                System.out.println("Deletion Successful... "+rows+" row(s) affected.");
            }
            else {
                System.out.println("Deletion Failed...");
            }
        }
        catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
