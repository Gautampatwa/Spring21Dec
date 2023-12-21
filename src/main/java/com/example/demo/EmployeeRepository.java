package com.example.demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public interface EmployeeRepository extends CrudRepository<Employee, Long>{

	void deleteAllById(Long id);

}
