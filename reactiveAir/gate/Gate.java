package com.dz_fs_dev.airlines.reactiveAir.gate;

import org.springframework.data.annotation.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Represents a gate at an airport.
 * 
 * @author DZ-FSDev
 * @since 17.0.2
 * @version 0.0.1
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Gate implements IGate{
	private @Id Long id;
}
