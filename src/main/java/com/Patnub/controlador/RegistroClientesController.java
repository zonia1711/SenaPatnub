package com.Patnub.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Patnub.Entidad.RegistroClientes;
import com.Patnub.InterfaceService.IRegistroClientes;

@Controller
@RequestMapping("")
public class RegistroClientesController {

	private final IRegistroClientes registroClientesServicio;

	// Constructor que recibe el servicio como parámetro e inicia el atributo
	// registroClientesServicio
	
	public RegistroClientesController(IRegistroClientes registroClientesServicio) {
		this.registroClientesServicio = registroClientesServicio;
	}

	// Manejar las solicitudes GET a /RegistroClientes
	@GetMapping("/RegistroClientes")
	public String show(Model model) {
		model.addAttribute("RegistroClientes", new RegistroClientes());// Agrega un nuevo objeto RegistroClientes al																// modelo para utilizarlo en la vista
		return "RegistroClientes";
	}

	// Maneja las solicitudes POST a /RegistroClientes/save
	@PostMapping("/RegistroClientes/save")
	public String save(@Validated RegistroClientes clientes, Model model) { // Guarda el objeto RegistroClientes
		registroClientesServicio.save(clientes);// recibido en la base de datos
		return "redirect:/RegistroClientes";// Redirige al usuario a la página de listado después de guardar
	}
}