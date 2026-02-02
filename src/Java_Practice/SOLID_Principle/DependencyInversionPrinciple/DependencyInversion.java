package Java_Practice.SOLID_Principle.DependencyInversionPrinciple;

// Without DIP

//class EmailService {
//    void sendEmail(String message) {
//        System.out.println("Email sent: " + message);
//    }
//}

//class NotificationService {
//
//    private EmailService emailService = new EmailService();
//
//    void notifyUser(String message) {
//        emailService.sendEmail(message);
//    }
//}

//What’s wrong?
//
//NotificationService depends on EmailService
//
//Cannot switch to SMS / WhatsApp / Push easily
//
//Hard to test (no mocking)



public class DependencyInversion {
    public static void main(String[] args) {
        MessageService emailService = new EmailService();
        NotificationService notification = new NotificationService(emailService);
        notification.notifyUser("Hello Deepan!");
    }
}
