package Day5.Comparator_and_Comparable;

import java.util.Comparator;

public class MyComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2){
        return Integer.compare(s1.rno,s2.rno);
    }
}

