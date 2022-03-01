package com.dz_fs_dev.airlines.reactiveAir.employee;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * /employees WEB Service Controller.
 * 
 * @author DZ-FSDev
 * @since 17.0.2
 * @version 0.0.1
 */
@Controller
@RequestMapping("/employees")
public class WEBController_Employee {
	@GetMapping("/home")
	public String getHome(Model model) {
		return "/home";
	}
	
}
