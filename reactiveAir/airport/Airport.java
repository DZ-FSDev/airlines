package com.dz_fs_dev.airlines.reactiveAir.airport;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Represents an airport.
 * 
 * @author DZ-FSDev
 * @since 17.0.1
 * @version 0.0.1
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Airport {
	private @Id Long id;
	private String name;
}
