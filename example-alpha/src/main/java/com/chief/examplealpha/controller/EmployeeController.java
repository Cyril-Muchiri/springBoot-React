package com.chief.examplealpha.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.chief.examplealpha.client.EmployeeInit;
import com.chief.examplealpha.entity.Employee;

@RestController
@RequestMapping(path = "api/employee")
public class EmployeeController {
    EmployeeInit init = new EmployeeInit();
    {
        init.creatEmployee();
    }

    @GetMapping(path = "/getAll")
    public List<Employee> getEmployees(){
        return init.displayRepo();
    }

    @DeleteMapping(path = "/delete/{id}")
    public String deleteEmployee(@PathVariable Long id){
        return init.deleteEmployee(id);
    }

    
}
