package Day5.Lambdas;

public interface CalculateInterFace {
    int calculate(int x, int y);
}
class calculator{
    public static void main(String[] args) {
        CalculateInterFace i=(a,b)->a+b;
        System.out.println(i.calculate(2,4));
        CalculateInterFace i2=(a,b)->a*b;
        System.out.println(i2.calculate(2,4));
        CalculateInterFace i3=(a,b)->a/b;
        System.out.println(i3.calculate(2,4));
    }
}

