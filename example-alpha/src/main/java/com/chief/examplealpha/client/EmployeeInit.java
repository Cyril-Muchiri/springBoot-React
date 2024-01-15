package com.chief.examplealpha.client;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.chief.examplealpha.entity.Employee;

@Component
public class EmployeeInit implements CommandLineRunner {

    private List<Employee> employeeRepo = new ArrayList<>();

    public void creatEmployee() {
        Long id = 1L;

        Employee mary = new Employee(id, "Mary Mutua", "07****454*9", "101-uthiru", LocalDate.of(1999, 7, 7));
        mary.setAge();
        Employee ken = new Employee(++id, "Ken Ruto", "07****454*9", "101-uthiru", LocalDate.of(1990, 7, 7));
        ken.setAge();
        Employee mercy = new Employee(++id, "Mercy Cheboi", "07****454*9", "101-uthiru", LocalDate.of(1995, 10, 2));
        mercy.setAge();
        Employee nancy = new Employee(++id, "Nancy Magut", "07****454*9", "101-uthiru", LocalDate.of(2002, 12, 2));
        nancy.setAge();

        employeeRepo.addAll(List.of(mary, ken, mercy, nancy));
    }

    public List<Employee> displayRepo() {

        return employeeRepo;
    }

    public String deleteEmployee(Long id) {
        Employee delEmployee = findEmployee(id);
        employeeRepo.remove(delEmployee);
        return "" + delEmployee.getName() + " has been deleted succesfully!!I";

    }

    public Employee findEmployee(Long id) {
        return employeeRepo.stream()
                .filter(employee -> employee.getId().equals(id))
                .findFirst().orElse(null);
    }

    @Override
    public void run(String... args) throws Exception {
        creatEmployee();
    }

}
