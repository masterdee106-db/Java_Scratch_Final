package Java_Practice.JDBCConcept.Project;

import javax.print.Doc;
import java.sql.*;
import java.util.Scanner;

public class HospitalManagementSystem {
    private static final String url="jdbc:mysql://localhost:3306/hospital";
    private static final String userName="root";
    private static final String password = "root";
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        Scanner scanner=new Scanner(System.in);
        try {
            Connection connection= DriverManager.getConnection(url,userName,password);
            Patient patient = new Patient(connection, scanner );
            Doctor doctor = new Doctor(connection);

            while (true){
                System.out.println(" HOSPITAL MANAGEMENT SYSTEM ");
                System.out.println("1. Add Patient");
                System.out.println("2. View Patient");
                System.out.println("3. View Doctors");;
                System.out.println("4. Book Appointment");
                System.out.println("5. View Appointment");
                System.out.println("6. Exit!");
                System.out.print("Enter you choice: ");
                int choice = scanner.nextInt();

                switch (choice){
                    case 1:
                        patient.addPatient();
                        break;
                    case 2:
                        patient.viewPatient();
                        break;
                    case 3:
                        doctor.viewDoctor();
                        break;
                    case 4:
                        bookAppointment(patient, doctor, connection, scanner);
                        break;
                    case 5:
                        viewAppointments(connection);
                        break;
                    case 6:
                        return;
                    default:
                        System.out.println("Enter a valid choice!!");
                }

            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static void bookAppointment(Patient patient, Doctor doctor, Connection connection, Scanner scanner ){
        System.out.println("Enter patientId");
        int patientId=scanner.nextInt();
        System.out.println("Enter doctorId");
        int doctorId=scanner.nextInt();
        System.out.println("Enter Appointment Date(YYYY-MM-DD): ");
        String appointmentDate=scanner.next();

        if (patient.getPatientById(patientId) && doctor.getDoctorById(doctorId)){
            if (checkDoctorAvailability(doctorId, appointmentDate, connection)){
                String appointmentQuery = "INSERT INTO appointments(patientId, doctorId, appointmentDate) values(?, ?, ?)";
                try{
                    PreparedStatement preparedStatement=connection.prepareStatement(appointmentQuery);
                    preparedStatement.setInt(1, patientId);
                    preparedStatement.setInt(2, doctorId);
                    preparedStatement.setString(3, appointmentDate);
                    int rowsAffected = preparedStatement.executeUpdate();
                    if (rowsAffected>0){
                        System.out.println("Appointment Booked!!!");
                    }
                    else {
                        System.out.println("Failed to book Appointment!!!");
                    }
                }
                catch (SQLException e){
                    e.printStackTrace();
                }
            }
            else {
                System.out.println("Doctor Not available on this date!!!");
            }
        }
        else {
            System.out.println("Either Doctor or Patient doesn't exist!!!");
        }
    }

    public static boolean checkDoctorAvailability(int doctorId, String appointmentDate, Connection connection){
        String query = "select count(*) from appointments where doctorId=? and appointmentDate=?";
        try{
            PreparedStatement preparedStatement=connection.prepareStatement(query);
                    preparedStatement.setInt(1, doctorId);
                    preparedStatement.setString(2, appointmentDate);
                    ResultSet resultSet = preparedStatement.executeQuery();
                    if (resultSet.next()){
                        int count=resultSet.getInt(1);
                        if (count==0){
                            return true;
                        }
                        else {
                            return false;
                        }
                    }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        return false;
    }


    public static void viewAppointments(Connection connection) {
        String query =
                "SELECT a.id, " +
                        "p.id AS patientId, p.name AS patientName, " +
                        "d.id AS doctorId, d.name AS doctorName, " +
                        "a.appointmentDate " +
                        "FROM appointments a " +
                        "JOIN patients p ON a.patientId = p.id " +
                        "JOIN doctors d ON a.doctorId = d.id";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();

            System.out.println("\nAppointments:");
            System.out.println("+-----------+----------------+-----------+----------------+------------------+");
            System.out.println("| PatientId | Patient Name   | DoctorId  | Doctor Name    | Appointment Date |");
            System.out.println("+-----------+----------------+-----------+----------------+------------------+");

            while (resultSet.next()) {
                int patientId = resultSet.getInt("patientId");
                String patientName = resultSet.getString("patientName");
                int doctorId = resultSet.getInt("doctorId");
                String doctorName = resultSet.getString("doctorName");
                String appointmentDate = resultSet.getString("appointmentDate");

                System.out.printf("| %-9d | %-14s | %-9d | %-14s | %-16s|\n",
                        patientId, patientName, doctorId, doctorName, appointmentDate);
            }

            System.out.println("+-----------+----------------+-----------+----------------+------------------+");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
