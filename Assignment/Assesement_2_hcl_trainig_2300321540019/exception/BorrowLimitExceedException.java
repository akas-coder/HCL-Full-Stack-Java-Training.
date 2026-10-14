package Assignment.Assesement_2_hcl_trainig_2300321540019.exception;

public class BorrowLimitExceedException extends RuntimeException{
    BorrowLimitExceedException(String msg){
        super("Borrow limit exceed beyond 3");
    }
}
