package Day5.BuiltInInterface;

import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class AllExample {
    public static void main(String[] args) {
        Predicate<Integer>p=n->n%2==0;
        System.out.println(p.test(3));
        System.out.println(p.test(4));

        Predicate<Integer>c=n->n>10;
        System.out.println(c.test(11));
        System.out.println(c.test(9));

        BiFunction<Integer,Integer,Integer> k=(a, b)->a+b;
        System.out.println(k.apply(2,3));

        Supplier<Integer>s=()->Math.max(3,4);
        System.out.println(s.get());

    }
}
