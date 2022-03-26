package com.dz_fs_dev.airlines.reactiveAir;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.web.servlet.MockMvc;

import com.dz_fs_dev.airlines.reactiveAir.employee.RESTController_Employee;

/**
 * Contains a battery of tests to ensure Reactive Air Application conforms to
 * requirements.
 * 
 * @author DZ-FSDev
 * @since 17.0.2
 * @version 0.0.1
 */
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
class ReactiveAirApplicationTests {
	@Autowired
	private MockMvc mockMvc;
	
	@Autowired
	private RESTController_Employee restEmployee;

	@Test
	public void contextLoads() throws Exception {
		assertNotNull(restEmployee);
	}
}
