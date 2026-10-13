package Day6.CustomException;

public class InvalidAgeException extends Exception {
    InvalidAgeException(String msg) {
        super(msg);
    }
}
    class CustomException {
        public static void main(String[] args) {
            try {
                int age = 17;
                if (age < 18) {
                    throw new InvalidAgeException("Age Must be greater than 18");
                }
            } catch (InvalidAgeException e) {
                System.out.println("Invalid Age");
                System.out.println(e.getMessage());
               // System.out.println(e.fillInStackTrace());
            }
        }
    }


