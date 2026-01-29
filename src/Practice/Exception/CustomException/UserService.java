package Practice.Exception.CustomException;

public class UserService {
    public void registerUser(String email, int age){
        if (age<18){
            throw new InvalidUserException("User must be atleast 18 years old...");
        }
        if (!email.contains("@")){
            throw new InvalidUserException("Invalid emailId");
        }
        System.out.println("User Registered successfully...");
    }
}
