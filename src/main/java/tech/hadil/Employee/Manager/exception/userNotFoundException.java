package tech.hadil.Employee.Manager.exception;

public class userNotFoundException extends RuntimeException{
    public userNotFoundException(String message){
        super(message);
    }
}
