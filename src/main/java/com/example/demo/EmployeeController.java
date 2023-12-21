package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
public class EmployeeController {

	
	@Autowired
	EmployeeService employeeservice;
	
	@GetMapping("/employee")
	public List<Employee> getallEmployee()
	{
		return employeeservice.getallEmployee();
	}
	
	@GetMapping("/employee/{id}")
	public Employee getEmpById(@PathVariable("id")Long id)
	{
		return employeeservice.getEmpById(id);
		
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteById(@PathVariable("id")Long id)
	{
	  employeeservice.deleteById(id);
		
	}
	
	@PostMapping("/save")
	public Employee save(@RequestBody Employee emp)
	{
		return employeeservice.save(emp);
	}
	
	@PutMapping("/update")
	public Employee update(@RequestBody Employee emp)
	{
		return employeeservice.save(emp);
	}
	
}
