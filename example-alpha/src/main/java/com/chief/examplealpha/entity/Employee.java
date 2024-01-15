package com.chief.examplealpha.entity;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class Employee {
    
    private Long id;
    private String name;
    private String tel;
    private String address;
    private LocalDate dob;
    private Long employeeAge;
    
    

    public Employee() {
    }

    public Employee(Long id, String name, String tel, String address, LocalDate empDob) {
        this.id = id;
        this.name = name;
        this.tel = tel;
        this.address = address;
        this.dob =empDob;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Long getAge() {
        return employeeAge;
    }

    public void setAge() {
        this.employeeAge= ChronoUnit.YEARS.between(dob, LocalDate.now());
       
    }

}
