package com.dz_fs_dev.airlines.reactiveAir.employee;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

/**
 * Persistence layer for {@link Employee} entities.
 * 
 * @author DZ-FSDev
 * @since 17.0.2
 * @version 0.0.2
 */
public interface IEmployeeRepository  extends ReactiveCrudRepository<Employee, Long>{
    Flux<Employee> findByFirstName(String firstName);
	
    Flux<Employee> findByLastName(String lastName);
    
    Flux<Employee> findByFirstNameOrderByFirstName(String firstName);
	
    Flux<Employee> findByLastNameOrderByFirstName(String lastName);
}
