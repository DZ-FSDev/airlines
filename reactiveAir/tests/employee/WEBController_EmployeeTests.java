package com.dz_fs_dev.airlines.reactiveAir.employee;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

/**
 * Contains a battery of tests to ensure Reactive Air Application 
 * {@link WEBController_Employee} conforms to requirements.
 * 
 * @author DZ-FSDev
 * @since 17.0.2
 * @version 0.0.2
 */
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
class WEBController_EmployeeTests {
	@Autowired
	private MockMvc mockMvc;
	
	@Autowired
	private RESTController_Employee restEmployee;

	@Test
	public void contextLoads() throws Exception {
		assertNotNull(restEmployee);
		
		this.mockMvc.perform(get("/employees/home"))/*.andDo(print())*/.andExpect(status().isOk())
		.andExpect(content().contentTypeCompatibleWith(MediaType.TEXT_HTML));
	}
}
