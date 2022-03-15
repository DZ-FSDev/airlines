package com.dz_fs_dev.airlines.reactiveAir.employee;

import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * Persistence layer for {@link Employee} entities.
 * 
 * @author DZ-FSDev
 * @since 17.0.2
 * @version 0.0.11
 */
public interface IEmployeeRepository  extends ReactiveCrudRepository<Employee, Long>{

	<T extends IEmployee> Mono<T> findById(Class<T> type, Long id);
	<T extends IEmployee> Flux<T> findAllBy(Class<T> type);
	<T extends IEmployee> Flux<T> findByFirstName(String firstName, Class<T> type);
	<T extends IEmployee> Flux<T> findByLastName(String lastName, Class<T> type);
	<T extends IEmployee> Flux<T> findByFirstNameOrderByFirstName(String lastName, Class<T> type);
	<T extends IEmployee> Flux<T> findByLastNameOrderByFirstName(String lastName, Class<T> type);
	
	@Query("SELECT * FROM employee e "
			+ "JOIN employee f ON e.id = f.manager_id")
	<T extends IEmployee> Flux<T> findAllManagers(Class<T> type);
	
	@Query("SELECT * FROM employee e WHERE e.manager_id IS NOT NULL")
	<T extends IEmployee> Flux<T> findAllManagedEmployees(Class<T> type);
	
	@Query("SELECT * FROM employee e "
			+ "JOIN employee f ON e.id = f.supervisor_id")
	<T extends IEmployee> Flux<T> findAllSupervisors(Class<T> type);
	
	@Query("SELECT * FROM employee e WHERE e.supervisor_id IS NOT NULL")
	<T extends IEmployee> Flux<T> findAllSupervisedEmployees(Class<T> type);
}
