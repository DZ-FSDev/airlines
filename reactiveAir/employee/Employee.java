package com.dz_fs_dev.airlines.reactiveAir.employee;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.relational.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Represents an airline employee.
 * 
 * @author DZ-FSDev
 * @since 17.0.2
 * @version 0.0.8
 */
@Table
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee implements IEmployee{
	private @Id Long id;
	
	private String firstName;
	private String lastName;
	
	private Long startTS;
	
	private Long supervisor_id;
	private Long manager_id;

	@CreatedDate
	private Long createdAt;
	@LastModifiedDate
	private Long lastModified;
	@CreatedBy
	private String creator;
	@LastModifiedBy
	private String modifier;
}
