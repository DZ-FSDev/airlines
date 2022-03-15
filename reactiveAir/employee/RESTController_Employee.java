package com.dz_fs_dev.airlines.reactiveAir.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * /employees REST API Controller.
 * 
 * @author DZ-FSDev
 * @since 17.0.2
 * @version 0.0.9
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
	
	/**
	 * 
	 * @return
	 * @since 0.0.7
	 */
	@GetMapping("/hiring")
	private Flux<Employee> getAllHiredEmployees() {
	    return employeeSvc.findAllBy(Employee.class);
	}
	
	/**
	 * Temporary endpoint to add employees.
	 * 
	 * @param firstName
	 * @param lastName
	 * @return
	 * @since 0.0.8
	 */
	@GetMapping("/add")
	private Mono<Employee> addEmployee(String firstName, String lastName) {
	    Employee emp = new Employee();
	    emp.setFirstName(firstName);
	    emp.setLastName(lastName);
	    emp.setStartTS(System.currentTimeMillis());
	    
		return employeeSvc.save(emp);
	}
	
	/**
	 * 
	 * @param employee_id
	 * @param manager_id
	 * @return
	 * @since 0.0.9
	 */
	@GetMapping("/assignManager")
	private Mono<Boolean> assignManager(Long employee_id, Long manager_id){
		employeeSvc.assignManager(employee_id, manager_id);
		return Mono.just(Boolean.TRUE);
	}
}
