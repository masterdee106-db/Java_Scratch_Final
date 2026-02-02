package Java_Practice.SOLID_Principle.SingleResponsibility;

import java.util.Scanner;

class UserService{
    public void saveUser(String userName){
        System.out.println("User Saved: "+userName);
    }
}
class EmailService{
    public void sendWelcomeEmail(String userName){
        System.out.println("Welcome email sent to: "+userName);
    }
}

class ReportService{
    public void generateUserReport(String userName){
        System.out.println("Report generated for: "+userName);
    }
}
public class Single_Responsibility_Principle {
    public static void main(String[] args) {

        UserService user = new UserService();
        EmailService email = new EmailService();
        ReportService report = new ReportService();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter userName: ");
        String userName= scanner.nextLine();

        user.saveUser(userName);
        email.sendWelcomeEmail(userName);
        report.generateUserReport(userName);



    }
}
