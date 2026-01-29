package Practice.JDBCConcept;
import java.sql.*;
public class ReadOperation {
    public static void main(String[] args) throws ClassNotFoundException{
        String url="jdbc:mysql://localhost:3306/Students";
        String userName="root";
        String password="root";
        String query = "select * from Student;";
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
            ResultSet result = stmt.executeQuery(query);
            while (result.next()){
                int id=result.getInt("studentId");
                String name = result.getString("name");
                String domain = result.getString("domain");
                float annualFee=result.getFloat("annualFees");
                System.out.println("=========================================");

                System.out.println("studentId: "+id);
                System.out.println("Name: "+name);
                System.out.println("Domain: "+domain);
                System.out.println("AnnualFees: "+annualFee);
            }

            result.close();
            stmt.close();
            System.out.println("Statement Closed Successfully");
            con.close();
            System.out.println("Connection Closed Successfully...");

        }
        catch (SQLException e){
            System.out.println(e.getMessage());
        }


    }
}
