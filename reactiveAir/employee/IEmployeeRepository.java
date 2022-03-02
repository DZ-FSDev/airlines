package com.dz_fs_dev.airlines.reactiveAir.employee;

import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * Persistence layer for {@link Employee} entities.
 * 
 * @author DZ-FSDev
 * @since 17.0.2
 * @version 0.0.1
 */
@Repository
public interface IEmployeeRepository  extends ReactiveCrudRepository<Employee, Long>{
	@Query("SELECT * FROM employee WHERE last_name = :lastname")
    Flux<Employee> findByLastName(String lastName);

	@Query("SELECT * FROM employee WHERE id = :id")
	Mono<Employee> findEmployeeById(String id);

	@Query("SELECT * FROM employee")
	Flux<Employee> findAllEmployees();

	@Query("SELECT * FROM employee")
	Mono<Employee> updateEmployee(Employee employee);
}
