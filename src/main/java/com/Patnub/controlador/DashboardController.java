package com.Patnub.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//se llama a la home
@Controller
@RequestMapping("Dashboard")
public class DashboardController {

	@GetMapping("")
	public String show() {
		return "Dashboard";
	}
}
