package com.example.hclhrms.repository;
import com.example.hclhrms.entity.Employee;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EmployeeImpl implements EmployeeRepo{
   List<Employee>empList=new ArrayList<>();

    @Override
    public String addEmp(Employee emp) {
        empList.add(emp);
        return "Employee Added Successfully!";
    }

    @Override
    public Employee getEmp() {
        return null;
    }

    @Override
    public Employee getEmpById(long empid) {
        return null;
    }

    @Override
    public String deleteById(long empid) {
        return "";
    }

    @Override
    public String updateById(long empid, Employee updatedEmp) {
        return "";
    }
}
