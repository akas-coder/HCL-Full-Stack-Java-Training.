package Day5.Task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Mains {
    public static void main(String[] args) {
        List<Employee> emp=new ArrayList<>();
        emp.add(new Ak(1,"AKash",23500.0));
        emp.add(new Ak(2,"Vikas",25499.1));
        emp.add(new Ak(3,"durgesh",1000.10));

        Collections.sort(emp);
        for(Employee e: emp){
            System.out.println(e.display());
        }
    }
}
