package Day5.Comparator_and_Comparable;

public class Student {
    String name;
    int rno;
    int marks;

    public String getName() {
        return name;
    }

    public Student(String name, int rno, int marks) {
        this.name = name;
        this.rno = rno;
        this.marks = marks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRno() {
        return rno;
    }

    public void setRno(int rno) {
        this.rno = rno;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

}
