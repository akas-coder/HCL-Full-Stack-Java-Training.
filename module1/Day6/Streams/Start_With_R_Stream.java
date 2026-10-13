package Day6.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Start_With_R_Stream {
    public static void main(String[] args) {
        List<String>list=new ArrayList<>();
        list.addAll(Arrays.asList("Rahul","Aditya","Ranga","Ram","Shyam"));

        list.stream().filter(x->x.startsWith("R")).filter(x->x.endsWith("l")).forEach(x-> System.out.println(x));

        System.out.println("After Sorting");
    }
}
