package com.dz_fs_dev.airlines.reactiveAir.employee;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

/**
 * Persistence layer for {@link Employee} entities.
 * 
 * @author DZ-FSDev
 * @since 17.0.2
 * @version 0.0.6
 */
public interface IEmployeeRepository  extends ReactiveCrudRepository<Employee, Long>{
    
	<T extends IEmployee> Flux<T> findAllBy(Class<T> type);
	<T extends IEmployee> Flux<T> findByFirstName(String firstName, Class<T> type);
	<T extends IEmployee> Flux<T> findByLastName(String lastName, Class<T> type);
	<T extends IEmployee> Flux<T> findByFirstNameOrderByFirstName(String lastName, Class<T> type);
	<T extends IEmployee> Flux<T> findByLastNameOrderByFirstName(String lastName, Class<T> type);
	
}
