public class InvalidAgeException extends Exception {
    public InvalidAgeException() {
        super("Invalid Age, must be older then 18");
    }
}
