package Day6.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamImplementation {
    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,2,3,3,45,6));

        System.out.println("Print even no.");

        list.stream().filter(x->x%2==0).forEach(x-> System.out.println(x));

        System.out.println("print unique element");
        list.stream().distinct().forEach(x-> System.out.println(x));
        System.out.println("Squaring the number");
        list.stream().map(x->x*x).forEach(x-> System.out.println(x));

        System.out.println("After Sorting");
        list.stream().sorted().forEach(x-> System.out.println(x));
    }
}
