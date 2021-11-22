package com.example.semlabs;

import org.springframework.stereotype.Component;

@Component
public class EmployeeService {
    public void get_employee(){
        System.out.println("This is the EmployeeService. Getting Employee");
    }        
}