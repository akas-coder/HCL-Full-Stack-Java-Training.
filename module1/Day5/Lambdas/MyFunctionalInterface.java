package Day5.Lambdas;

@FunctionalInterface
public interface MyFunctionalInterface {
    void calculate(int x, int y);
}
class  Main{
    public static void main(String[] args) {
        MyFunctionalInterface i=( x,  y)->{
            System.out.println("Square of x : "+x*x);
            System.out.println("Addition  : "+ x + y);
            System.out.println("Division: "+x/y);
            System.out.println("Multiplication : "+y*x);
        };
        i.calculate(2,3);

    }
}

