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
 * @version 0.0.6
 */
@RestController
@RequestMapping("/employees")
public class RESTController_Employee {
	@Autowired
	private IEmployeeService employeeSvc;
	
	/**
	 * 
	 * @param id
	 * @return
	 * @since 0.0.5
	 */
	@GetMapping("/{id}")
	private Mono<Employee> getEmployeeById(@PathVariable String id) {
	    return employeeSvc.findById(Long.parseLong(id));
	}
	
	/**
	 * 
	 * @param id
	 * @return
	 * @since 0.0.5
	 */
	@GetMapping("/managers/{id}")
	private Mono<Employee> getManagerById(@PathVariable String id) {
	    return employeeSvc.findManagerById(Long.parseLong(id));
	}
	
	/**
	 * 
	 * @return
	 * @since 0.0.5
	 */
	@GetMapping("/count")
	private Mono<Long> getEmployeeCount() {
	    return employeeSvc.count();
	}
	
	/**
	 * 
	 * @return
	 * @since 0.0.5
	 */
	@GetMapping
	private Flux<Employee> getAllEmployees() {
	    return employeeSvc.findAllBy(Employee.class);
	}
	
	/**
	 * 
	 * @return
	 * @since 0.0.6
	 */
	@GetMapping("/managers")
	private Flux<Employee> getAllManagers() {
	    return employeeSvc.findAllManagersBy(Employee.class);
	}
}
