package Assignment.Assesement_2.exception;

public class LibraryException extends RuntimeException{
    LibraryException(String msg){
        super("Borrowing item not found");
    }
}
