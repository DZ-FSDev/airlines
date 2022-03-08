package com.dz_fs_dev.airlines.reactiveAir.jobHistory;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import reactor.core.publisher.Flux;

/**
 * Persistence layer for {@link JobHistory} entities.
 * 
 * @author DZ-FSDev
 * @since 17.0.2
 * @version 0.0.1
 */
public interface IJobHistoryRepository  extends ReactiveCrudRepository<JobHistory, Long>{
	
}
