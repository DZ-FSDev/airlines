package com.dz_fs_dev.airlines.reactiveAir.job;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import reactor.core.publisher.Flux;

/**
 * Persistence layer for {@link Job} entities.
 * 
 * @author DZ-FSDev
 * @since 17.0.2
 * @version 0.0.5
 */
public interface IJobRepository  extends ReactiveCrudRepository<Job, Long>{
	<T extends IJob> Mono<T> findById(Class<T> type, Long id);
	<T extends IJob> Flux<T> findAllBy(Class<T> type);
	<T extends IJob> Flux<T> findAllByTitle(Class<T> type, String title);
	
	<T extends IJob> Flux<T> findAllByTitle(Class<T> type, String title);
	<T extends IJob> Flux<T> findAllByTitleOrderBySalary(Class<T> type, String title);
	
	<T extends IJob> Flux<T> findAllBySalaryGreaterThan(Class<T> type, BigDecimal salary);
	
	<T extends IJob> Flux<T> findAllBySalaryBetween(Class<T> type, BigDecimal fromSalary, BigDecimal toSalary);
}
