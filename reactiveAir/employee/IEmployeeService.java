package com.dz_fs_dev.airlines.reactiveAir.employee;

import org.springframework.stereotype.Service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * The user of this interface should implement the various actions associated
 * with an employee service.
 * 
 * @author DZ-FSDev
 * @since 17.0.2
 * @version 0.0.5
 */
@Service
public interface IEmployeeService {
	<T extends IEmployee> Flux<T> findAllBy(Class<T> type);
	<T extends IEmployee> Flux<T> findByFirstName(String firstName, Class<T> type);
	<T extends IEmployee> Flux<T> findByLastName(String lastName, Class<T> type);
	<T extends IEmployee> Flux<T> findByFirstNameOrderByFirstName(String lastName, Class<T> type);
	<T extends IEmployee> Flux<T> findByLastNameOrderByFirstName(String lastName, Class<T> type);
	Mono<Employee> save(Employee emp);
	Mono<Employee> findById(long parseLong);
	Mono<Long> count();
	
	/**
	 * 
	 * @param employee_id
	 * @param manager_id
	 * @return 
	 * @since 0.0.2
	 */
	Mono<Boolean> assignManager(Long employee_id, Long manager_id);
	
	/**
	 * 
	 * @param employee_id
	 * @param supervisor_id
	 * @since 0.0.5
	 */
	Mono<Boolean> assignSupervisor(Long employee_id, Long supervisor_id);
	
	/**
	 * 
	 * @param <T>
	 * @param employee
	 * @param manager
	 * @since 0.0.3
	 */
	<T extends IEmployee> void assignManager(T employee, T manager);
}
