package com.example.semlabs;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao {
    public void get_employee() {
        System.out.println("I am an employee. DAO");
    }    
}
