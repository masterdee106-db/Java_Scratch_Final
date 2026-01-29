package Practice.JDBCConcept;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdationOperation {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/Students";
        String userName="root";
        String password="root";
//        String query = "select * from Student;";
        String updateQuery = "UPDATE Student\n"+
                "SET domain='Artificial Intelligence', annualFees=98000.25\n"+
                "where studentId=6;";
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
            int rows=stmt.executeUpdate(updateQuery);
            if (rows>0){
                System.out.println("Data Updated "+rows+" row(s) affected.");
            }
            else {
                System.out.println("Failed to Update...");
            }

        }
        catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
