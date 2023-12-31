package com.mouhcine.SpringBootAPiEmployeeManagement.core.controller;

import com.mouhcine.SpringBootAPiEmployeeManagement.core.bo.Employee;
import com.mouhcine.SpringBootAPiEmployeeManagement.core.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/")
public class EmployeeController {

    @Autowired
    IEmployeeService employeeService;
    @GetMapping("/")
    public String index(){
        return "index";
    }
    @GetMapping("employees")
    public List<Employee> getEmployees(){
        return employeeService.getEmployees();
    }

    @GetMapping("employees/{id}")
    public Employee getEmployee(@PathVariable("id") Long id){
        return employeeService.getEmployeeById(id).get();
    }

    @PostMapping("/employees")
    public Employee saveEmployee(@RequestBody Employee employee){
        return employeeService.save(employee);
    }
    @PutMapping("employees/{id}")
    public Employee updateEmployee(@RequestBody Employee employee,@PathVariable long id){
        Employee emp=employeeService.getEmployeeById(id).get();
        emp.setAge(employee.getAge());
        emp.setEmail(employee.getEmail());
        emp.setFullName(employee.getFullName());
        emp.setPhoneNumber(employee.getPhoneNumber());
        return employeeService.update(emp);
    }
    @DeleteMapping("employees/{id}")
    public String deleteEmployee(@PathVariable("id") Long id){
        employeeService.delete(id);
        return "Delete successFully";
    }
}
