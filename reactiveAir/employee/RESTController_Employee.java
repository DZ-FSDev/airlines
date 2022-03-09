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
 * @version 0.0.4
 */
@RestController
@RequestMapping("/employees")
public class RESTController_Employee {
	@Autowired
	private IEmployeeService employeeSvc;
	
	@GetMapping("/{id}")
	private Mono<Employee> getEmployeeById(@PathVariable String id) {
	    return employeeSvc.findById(Long.parseLong(id));
	}
	
	@GetMapping("/count")
	private Mono<Long> getEmployeeCount() {
	    return employeeSvc.count();
	}
	
	@GetMapping
	private Flux<DTOEmployeeSimple> getAllEmployees() {
	    return employeeSvc.findAllBy(DTOEmployeeSimple.class);
	}
	
	@GetMapping("/add")
	private Mono<Employee> addEmployee(String firstName, String lastName) {
	    Employee emp = new Employee();
	    emp.setFirstName(firstName);
	    emp.setLastName(lastName);
	    
		return employeeSvc.save(emp);
	}
}
