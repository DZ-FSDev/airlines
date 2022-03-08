package com.dz_fs_dev.airlines.reactiveAir.employee;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Simple DTO for employees used as a class-based projection to reveal
 * minimum identification for an Employee.
 * 
 * @author DZ-FSDev
 * @since 17.0.2
 * @version 0.0.2
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DTOEmployeeSimple {
	private String firstName;
	private String lastName;
}
