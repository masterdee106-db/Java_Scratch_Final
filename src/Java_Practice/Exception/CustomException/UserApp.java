package Java_Practice.Exception.CustomException;

public class UserApp {
    public static void main(String[] args) {
        UserService user = new UserService();

        try{
            user.registerUser("testgmail.com", 19);
        }
        catch (InvalidUserException e){
            System.out.println(e.getMessage());
        }
    }
}
