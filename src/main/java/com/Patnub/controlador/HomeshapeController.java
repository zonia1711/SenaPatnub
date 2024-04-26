package com.Patnub.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

// se llama la Homeshape
@Controller
@RequestMapping("Homeshape")
public class HomeshapeController {
	@GetMapping("")
	public String show() {
	return "Homeshape";	
	}

}
