package Day7.Task_1;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class EmployeeAnalytics  {

    record Employee(int id, String name, String dept, BigDecimal salary, LocalDate hireDate, Set<String> skills) {

    }

    static Employee e(int id, String n, String d, int sal, String date, String... skills) {
        return new Employee(id, n, d, BigDecimal.valueOf(sal), LocalDate.parse(date), Set.of(skills));
    }
    public static void main(String[] args) {
        List<Employee> emps = List.of(
                e(1, "Asha",   "Engineering",  90000, "2019-03-01", "Java", "SQL"),
                e(2, "Ravi",   "Engineering", 120000, "2016-07-15", "Java", "Spring", "AWS"),
                e(3, "Meera",  "HR",60000, "2020-01-10", "Recruiting"),
                e(4, "John",   "Sales",70000, "2018-11-20", "Negotiation", "CRM"),
                e(5, "Priya",  "Engineering", 105000, "2021-05-05", "Java", "React"),
                e(6, "Karan",  "Sales",        65000, "2022-02-14", "CRM"),
                e(7, "Sara",   "HR",           62000, "2017-09-09", "Recruiting", "Payroll"),
                e(8, "Vikram", "Finance",      80000, "2015-04-30", "Excel", "SQL"));
        //Q1- dept="engineering and sort based on salary in reversed manner
        List<String> l=emps.stream().filter(s->s.dept().equals("Engineering")).sorted(Comparator.comparing(Employee::salary,Comparator.reverseOrder())).map(e->e.name()).toList();
        System.out.println(l);

        //Q2 top 3 employee based on salary
        List<String> l2=emps.stream().sorted(Comparator.comparing(Employee::salary,Comparator.reverseOrder())).limit(3).map(e->e.name()).toList();
        System.out.println(l2);

        //Q3 Employees hired before 2018-01-01, oldest hire first, as "name (year)" strings
        List<String> l3=emps.stream().sorted(Comparator.comparing(Employee::hireDate)).filter(e -> e.hireDate().isBefore(LocalDate.of(2018, 1, 1))).map(e->e.name()+" "+ e.hireDate()).toList();
        System.out.println(l3);

        //Q4 All names joined as "Asha, Ravi, ..." using Collectors.joining
        String str= emps.stream().map(Employee::name).collect(Collectors.joining(","));
        System.out.println(str);

        //Q5 Total payroll as a BigDecimal using reduce (not a loop)
        BigDecimal sal=emps.stream().map(Employee::salary).reduce(BigDecimal.ZERO,BigDecimal::add);
        System.out.println(sal);

    }
}