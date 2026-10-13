package Day6.Exception_Handling;

public class ArithematicException {
    public static void main(String[] args) {
        try {
            int a=10;
            int b=0;
            System.out.println(a/b);
        }
        catch (ArithmeticException  e){
            System.out.println(e.getMessage());
            System.out.println("Cannot divide by zero");
        }
        finally {
            System.out.println(
                    "finished"
            );
        }
    }
}
