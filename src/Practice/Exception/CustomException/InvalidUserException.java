package Practice.Exception.CustomException;

public class InvalidUserException extends RuntimeException{

    public InvalidUserException(String message){
        super(message);
    }
}
