package Java_Practice.JDBCConcept.PreparedStatementConcept;

import java.sql.*;

public class ReadOperation_PreparedStatement {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/Students";
        String urserName="root";
        String password="root";
        // Read Query
        String readQuery="select * from Student where domain=? AND annualFees=?";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Drivers loaded successfully...");
        }
        catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

        try{
            Connection con = DriverManager.getConnection(url, urserName, password);
            System.out.println("Connection Successful...");

            PreparedStatement pstmt = con.prepareStatement(readQuery);
            pstmt.setString(1,"SAP");
            pstmt.setFloat(2, 60000);
            ResultSet rs=pstmt.executeQuery();

            while (rs.next()){
                int id=rs.getInt("studentId");
                String name=rs.getString("name");
                String domain=rs.getString("domain");
                float donation = rs.getFloat("annualFees");

                System.out.println("================================");
                System.out.println("Id: "+id);
                System.out.println("Name: "+name);
                System.out.println("Domain: "+domain);
                System.out.println("AnnualFees: "+donation);

            }
            pstmt.close();
            con.close();
        }
        catch (SQLException e){
            System.out.println("Failed to connect....");
        }
    }
}
