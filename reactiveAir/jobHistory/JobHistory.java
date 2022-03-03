package com.dz_fs_dev.airlines.reactiveAir.jobHistory;

import org.springframework.data.annotation.Id;

import com.dz_fs_dev.airlines.reactiveAir.job.Job;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class JobHistory extends Job{
	private @Id Long id;
	private Long endTS;
}
