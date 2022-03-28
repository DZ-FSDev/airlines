package com.dz_fs_dev.airlines.reactiveAir.gate;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

/**
 * Reactive Persistence layer for {@link Gate} entities.
 * 
 * @author DZ-FSDev
 * @since 17.0.2
 * @version 0.0.1
 */
public interface IGateRepository  extends ReactiveCrudRepository<Gate, Long>{

}
