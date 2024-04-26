package com.Patnub.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Patnub.Entidad.Ingreso;
import com.Patnub.InterfaceService.IIngreso;

@Controller
@RequestMapping("")
public class IngresoController {

	private final IIngreso IngresoServicio;

	public IngresoController(IIngreso ingresoServicio) {
		this.IngresoServicio = ingresoServicio;

	}

	@GetMapping("/Ingreso") // entidad
	public String show(Model model) {
		model.addAttribute("Ingreso", new Ingreso());
		return "Ingreso";// entidad
	}

	@PostMapping("/save")
	public String Save(@Validated Ingreso usuario, Model model) {
		IngresoServicio.save(usuario);

		if (usuario != null && "Patricia".equals(usuario.getUsuario()) && "Contraseña".equals(usuario.getContraseña())) {
		model.addAttribute("mensaje","Bievenido,Patricia");
		return "redirect:/Homeshape";
		}
		else {
			model.addAttribute("mensaje","Credenciales incorrectas");
		return "redirect:/Homeshape";
		}
	}
}
