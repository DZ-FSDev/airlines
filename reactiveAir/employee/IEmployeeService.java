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
 * @version 0.0.7
 */
@Service
public interface IEmployeeService {
	<T extends IEmployee> Flux<T> findAllBy(Class<T> type);
	<T extends IEmployee> Flux<T> findByFirstName(String firstName, Class<T> type);
	<T extends IEmployee> Flux<T> findByLastName(String lastName, Class<T> type);
	<T extends IEmployee> Flux<T> findByFirstNameOrderByFirstName(String lastName, Class<T> type);
	<T extends IEmployee> Flux<T> findByLastNameOrderByFirstName(String lastName, Class<T> type);
	Mono<Employee> save(Employee emp);
	Mono<Employee> findById(Long parseLong);
	Mono<Long> count();

	/**
	 * Assigns a manager to an employee. The manager must be an existing employee.
	 * 
	 * @param employee_id The primary key for the employee to be managed.
	 * @param manager_id The primary key of the manager.
	 * @return Whether assignment of the manager was successful.
	 * @since 0.0.4
	 */
	Mono<Boolean> assignManager(Long employee_id, Long manager_id);

	/**
	 * Assigns a supervisor to an employee. The supervisor must be an existing employee.
	 * 
	 * @param employee_id The primary key for the employee to be supervised.
	 * @param supervisor_id The primary key of the supervisor.
	 * @return Whether assignment of the supervisor was successful.
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

	/**
	 * 
	 * @param <T>
	 * @param type
	 * @return
	 * @since 0.0.6
	 */
	<T extends IEmployee> Flux<T> findAllManagersBy(Class<T> type);

	/**
	 * 
	 * @param manager_id
	 * @return
	 * @since 0.0.7
	 */
	Mono<Employee> findManagerById(Long manager_id);
}
