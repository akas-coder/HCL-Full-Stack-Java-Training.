package Day5.Lambdas;

@FunctionalInterface
public interface MyFunctionalInterface {
    void show();
}
class  Main{
    public static void main(String[] args) {
        MyFunctionalInterface i=()->{
            System.out.println("This is my functional interface");
        };
        i.show();
    }
}

