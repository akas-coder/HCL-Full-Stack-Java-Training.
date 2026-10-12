package Day5.Lambdas;

public interface EvenOdd {
    boolean check(int a);
}
class EvenandOdd {
    public static void main(String[] args) {
        EvenOdd i = (a) -> a % 2 == 0;
        System.out.println(i.check(3));
        System.out.println(i.check(4));
    }

}