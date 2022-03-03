package com.dz_fs_dev.airlines.reactiveAir.jobHistory;

import java.math.BigDecimal;

import org.springframework.data.annotation.Id;

import com.dz_fs_dev.airlines.reactiveAir.employee.Employee;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Represents a past job that an employee held.
 * 
 * @author DZ-FSDev
 * @since 17.0.2
 * @version 0.0.2
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobHistory{
	private @Id Long id;
	private Employee employee;
	private String title;
	private BigDecimal salary;
	private Long endTS;
}
