package com.chief.examplealpha.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chief.examplealpha.client.EmployeeInit;
import com.chief.examplealpha.entity.Employee;

@RestController
@RequestMapping(path = "api/employee")
public class EmployeeController {

    @GetMapping(path = "/getAll")
    public List<Employee> getEmployees(){
        EmployeeInit init = new EmployeeInit();
        return init.creatEmployee();
    }

    
}
