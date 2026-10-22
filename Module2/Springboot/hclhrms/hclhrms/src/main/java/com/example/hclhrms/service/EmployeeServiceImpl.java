package com.example.hclhrms.service;

import com.example.hclhrms.entity.Employee;
import com.example.hclhrms.repository.EmployeeImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl {
    @Autowired
    private EmployeeImpl impl;
    public String addEmp(){
        Employee emp1=new Employee(1,"Akash","FSD","java","ak@gmail.com");
        impl.addEmp(emp1);
        return "emp1 gone to EmployeeImpl";
    }
}
