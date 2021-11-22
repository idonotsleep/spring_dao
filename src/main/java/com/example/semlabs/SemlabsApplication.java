package com.example.semlabs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

@SpringBootApplication
public class SemlabsApplication {

	EmployeeService employeeService;

	@Autowired
	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	public static void main(String[] args) {
		
		AbstractApplicationContext  context = new AnnotationConfigApplicationContext(SemlabsApplication.class);
        EmployeeService employeeService = (EmployeeService) context.getBean("employeeService");
		employeeService.get_employee();
		context.close();
		
	}

}



