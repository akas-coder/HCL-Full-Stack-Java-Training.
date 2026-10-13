package Assignment.Assesement_2.exception;

public class BorrowLimitExceedException extends RuntimeException{
    BorrowLimitExceedException(String msg){
        super("Borrow limit exceed beyond 3");
    }
}
