package Java_Practice.SOLID_Principle.DependencyInversionPrinciple;

public class EmailService implements MessageService{
    public void sendMessage(String message){
        System.out.println("Email Sent: "+message);
    }
}
