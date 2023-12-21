package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public class EmployeeService {


	@Autowired
	EmployeeRepository employeeRepository;
	public List<Employee> getallEmployee()
	{

	List<Employee> employee=new ArrayList<Employee>();
	employeeRepository.findAll().forEach(employee::add);
	return employee;
	}
	
	public Employee getEmpById(Long id)
	{
	return employeeRepository.findById(id).get();
	}
	
	public Employee save(Employee emp)
	{
		System.out.println("Hello World");
		return employeeRepository.save(emp);
	}
	
	public void deleteById(Long id)
	{
		employeeRepository.deleteById(id);
	}
	public void update(Employee emp)
	{
		employeeRepository.save(emp);
	}
	

}
