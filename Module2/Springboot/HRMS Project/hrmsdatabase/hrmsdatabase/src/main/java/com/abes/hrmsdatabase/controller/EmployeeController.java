package com.abes.hrmsdatabase.controller;

import com.abes.hrmsdatabase.model.Employee;
import com.abes.hrmsdatabase.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
@RequestMapping("/v1/user")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping("/")
    public String welcome(){
        return "<h1> Welcome to HRMS Database </h1>";
    }

    @PostMapping("/addNewEmployee")
    public String addNewEmployee(@RequestBody Employee employee){
        return employeeService.createNewEmployee(employee);
    }

    @PostMapping("/login")
    public Employee login(@RequestBody Employee emp){
        return employeeService.login(emp.getEmpId(), emp.getEmail(), emp.getPassword());
    }

    @GetMapping("/findById/{empid}")
    public String getById(@PathVariable long empid){
        return employeeService.getById(empid);
    }

    @DeleteMapping("/deleteByid/{empid}")
    public String deleteById(@PathVariable long empid){
        return employeeService.deleteById(empid);
    }

    @PutMapping("/updateEmployee/{empid}")
    public String updateEmployee(
            @PathVariable long empid,
            @RequestBody Employee emp) {

        return employeeService.updateEmployee(empid, emp);
    }
}
