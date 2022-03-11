package com.dz_fs_dev.airlines.reactiveAir.department;

import java.math.BigDecimal;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Represents a department at an airline.
 * 
 * @author DZ-FSDev
 * @since 17.0.2
 * @version 0.0.3
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Department implements IDepartment{
	private @Id Long id;
	private String name;
	private BigDecimal budget;
	
	private Long airport_id;
}
