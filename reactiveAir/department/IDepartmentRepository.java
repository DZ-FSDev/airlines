package com.dz_fs_dev.airlines.reactiveAir.department;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

/**
 * Reactive persistence layer for {@link Department} entities in an airport.
 * 
 * @author DZ-FSDev
 * @since 17.0.2
 * @version 0.0.1
 */
public interface IDepartmentRepository extends ReactiveCrudRepository<Department, Long>{

}
