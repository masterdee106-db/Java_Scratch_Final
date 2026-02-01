package Java_Practice.JDBCConcept;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class BatchProcessing {
    public static void main(String[] args) {

        String url="jdbc:mysql://localhost:3306/Students";
        String userName="root";
        String password="root";
        String query = "INSERT INTO Student(name, domain, annualFees)VALUES(?, ?, ?)";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver Loaded Successfully...");
        }
        catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

        try{
            Connection connection = DriverManager.getConnection(url, userName,password);
            System.out.println("Connection Established Successfully...");
            PreparedStatement preparedStatement=connection.prepareStatement(query);
            connection.setAutoCommit(false);
            Scanner scanner = new Scanner(System.in);
            while (true){
                System.out.print("Enter Name: ");
                String name= scanner.nextLine();
                System.out.print("Enter Domain: ");
                String domain = scanner.nextLine();
                System.out.print("Enter the AnnualFees: ");
                float annualFees = scanner.nextFloat();

                preparedStatement.setString(1,name);
                preparedStatement.setString(2, domain);
                preparedStatement.setFloat(3, annualFees);
                scanner.nextLine();
                preparedStatement.addBatch();
                System.out.println("Add More values Y/N: ");
                String decision = scanner.nextLine();
                if (decision.equalsIgnoreCase("N")){
                    break;
                }
            }
            int[] batchResult =preparedStatement.executeBatch();
            connection.commit();
            System.out.println("Batch Executed Successfully!!!");
        }
        catch (SQLException e){
            System.out.println(e.getMessage());
            System.out.println("Connection Failed!");
        }
    }
}
