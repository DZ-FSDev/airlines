package com.dz_fs_dev.airlines.reactiveAir.employee;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Represents an airline employee.
 * 
 * @author DZ-FSDev
 * @since 17.0.2
 * @version 0.0.1
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	private String id;
    private String firstName;
    private String lastName;
}
