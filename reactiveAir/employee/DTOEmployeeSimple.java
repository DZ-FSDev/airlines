/*  Original Licensing Copyright
 * 
 *  DTO for employees to reveal minimum identification.
 *  Copyright (C) 2022  DZ-FSDev
 *  
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
package com.dz_fs_dev.airlines.reactiveAir.employee;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Simple DTO used as a class-based projection to reveal minimum identification
 * for an Employee.
 * 
 * @author DZ-FSDev
 * @since 17.0.2
 * @version 0.0.3
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DTOEmployeeSimple implements IEmployee{
	private Long id;
	private String firstName;
	private String lastName;
}
