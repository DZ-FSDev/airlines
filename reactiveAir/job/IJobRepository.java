package com.dz_fs_dev.airlines.reactiveAir.job;

import java.math.BigDecimal;

import org.springframework.data.r2dbc.repository.R2dbcRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * Reactive Persistence layer for {@link Job} entities.
 * 
 * @author DZ-FSDev
 * @since 17.0.2
 * @version 0.0.6
 */
public interface IJobRepository  extends R2dbcRepository<Job, Long>{
	<T extends IJob> Mono<T> findById(Class<T> type, Long id);
	<T extends IJob> Flux<T> findAllBy(Class<T> type);
	<T extends IJob> Flux<T> findAllByTitle(Class<T> type, String title);
	<T extends IJob> Flux<T> findAllByTitleOrderBySalary(Class<T> type, String title);
	
	<T extends IJob> Flux<T> findAllBySalaryGreaterThan(Class<T> type, BigDecimal salary);
	<T extends IJob> Flux<T> findAllBySalaryLessThan(Class<T> type, BigDecimal salary);
	
	<T extends IJob> Flux<T> findAllBySalaryBetween(Class<T> type, BigDecimal fromSalary, BigDecimal toSalary);
}
