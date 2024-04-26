package com.Patnub.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Patnub.Entidad.Reserva;
import com.Patnub.InterfaceService.IReserva;

@Controller
@RequestMapping("")
public class ReservaController {
	
	private final IReserva reservaServicio;
	
	public ReservaController(IReserva reservaServicio) {
		this.reservaServicio = reservaServicio;
	}
	
	@GetMapping("/Reserva")
	public String show(Model model) {
		model.addAttribute("reserva", new Reserva());
		return "Reserva";
	}
	
	@PostMapping("/Reserva/save")
	public String save(@Validated Reserva reserva, Model model) {
		reservaServicio.save(reserva);
		return "redirect:/Reserva";
	}
}