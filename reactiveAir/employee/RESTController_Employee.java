package com.dz_fs_dev.airlines.reactiveAir.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * /employees REST API Controller.
 * 
 * @author DZ-FSDev
 * @since 17.0.1
 * @version 0.0.2
 */
@RestController
@RequestMapping("/employees")
public class RESTController_Employee {
	@Autowired
	private IEmployeeRepository employeeRepository;
	
	@GetMapping("/{id}")
	private Mono<Employee> getEmployeeById(@PathVariable String id) {
	    return employeeRepository.findById(Long.parseLong(id));
	}
	
	@GetMapping
	private Flux<Employee> getAllEmployees() {
	    return employeeRepository.findAll();
	}
	
	@GetMapping("/add")
	private Mono<Employee> addEmployee(String firstName, String lastName) {
	    Employee emp = new Employee();
	    emp.setFirstName(firstName);
	    emp.setLastName(lastName);
	    
		return employeeRepository.save(emp);
	}
}
