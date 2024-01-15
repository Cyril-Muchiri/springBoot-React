package com.chief.examplealpha.client;

import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.chief.examplealpha.entity.Employee;

@Component
public class EmployeeInit implements CommandLineRunner {

    public List<Employee> creatEmployee() {

        Employee mary = new Employee(21L, "Mary Mutua", "07****454*9", "101-uthiru", LocalDate.of(1999, 7, 7));
        mary.setAge();
        return List.of(mary);
    }

    @Override
    public void run(String... args) throws Exception {
        creatEmployee();
    }

}
