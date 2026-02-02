package Java_Practice.SOLID_Principle.DependencyInversionPrinciple;

public class SmsService implements MessageService{
    public void sendMessage(String message){
        System.out.println("Sms Sent: "+message);
    }
}
