/*  Original Licensing Copyright
 * 
 *  Reactive Airlines Spring Boot Application.
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
package com.dz_fs_dev.airlines.reactiveAir;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.r2dbc.config.EnableR2dbcAuditing;

/**
 * Reactive Airlines Spring Boot Application.
 * 
 * @author DZ_FSDev
 * @since 17.0.2
 * @version 0.0.2
 */
@SpringBootApplication
@EnableR2dbcAuditing
public class ReactiveAirApplication {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ReactiveAirApplication.class, args);
	}

}
