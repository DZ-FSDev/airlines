package com.dz_fs_dev.airlines.reactiveAir.gate;

import org.springframework.data.r2dbc.repository.R2dbcRepository;

/**
 * Reactive Persistence layer for {@link Gate} entities.
 * 
 * @author DZ-FSDev
 * @since 17.0.2
 * @version 0.0.2
 */
public interface IGateRepository  extends R2dbcRepository<Gate, Long>{

}
