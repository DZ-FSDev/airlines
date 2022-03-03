package com.dz_fs_dev.airlines.reactiveAir.job;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

/**
 * Persistence layer for {@link Job} entities.
 * 
 * @author DZ-FSDev
 * @since 17.0.2
 * @version 0.0.1
 */
public interface IJobRepository  extends ReactiveCrudRepository<Job, Long>{

}
