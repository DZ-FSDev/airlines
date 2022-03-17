package com.dz_fs_dev.airlines.reactiveAir.job;

import java.math.BigDecimal;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Represents a job at an airline.
 * 
 * @author DZ-FSDev
 * @since 17.0.2
 * @version 0.0.3
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Job implements IJob{
	private @Id Long id;
	private String title;
	private BigDecimal salary;
	private Long endTS;
}
