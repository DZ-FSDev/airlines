package com.dz_fs_dev.airlines.reactiveAir.employee;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Represents an airline employee.
 * 
 * @author DZ-FSDev
 * @since 17.0.2
 * @version 0.0.5
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Employee implements IEmployee{
	private @Id Long id;
	private String firstName;
	private String lastName;
	
	private Long startTS;
	
	private Long job_id;
	
	private Long supervisor_id;
	private Long manager_id;
}
