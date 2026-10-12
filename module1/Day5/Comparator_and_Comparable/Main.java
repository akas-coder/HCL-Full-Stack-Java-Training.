package Day5.Comparator_and_Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> st=new ArrayList<>();
        st.add(new Student("AKash",1,95));
        st.add(new Student("vikas",2,94));
        Collections.sort(st,new MyComparator());
        for(Student s:st){
            System.out.println(s.name+" "+s.marks);
        }
    }
}
