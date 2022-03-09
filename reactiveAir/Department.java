package com.dz_fs_dev.airlines.reactiveAir.department;

import java.math.BigDecimal;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Represents a job at an airline.
 * 
 * @author DZ-FSDev
 * @since 17.0.2
 * @version 0.0.1
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department implements IDepartment{
	private @Id Long id;
	private String name;
	private BigDecimal budget;
}
