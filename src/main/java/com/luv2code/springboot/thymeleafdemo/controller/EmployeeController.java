package com.luv2code.springboot.thymeleafdemo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.luv2code.springboot.thymeleafdemo.model.Employee;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

	private List<Employee> employees;
	
	@PostConstruct
	private void loadData() {
		
		employees = new ArrayList<Employee>();
		
		employees.add(new Employee(1,"George","King","georg@google.com"));
		employees.add(new Employee(2,"Bilbo","Baggins","bb@google.com"));
		employees.add(new Employee(3,"Igor","Lebedev","igor@google.com"));
	}
	
	@GetMapping("/list")
	public String listEmployee(Model model) {
		
		model.addAttribute("employees", employees);
		
		return "employee-list";
	}
}
