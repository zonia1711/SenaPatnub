package com.Patnub.Servicio;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Patnub.Entidad.Reserva;
import com.Patnub.InterfaceService.IReserva;

@Service
public class ReservaServicio implements IReserva {

	@Override
	public Reserva save(Reserva reserva) {
		return reserva.save(reserva); 
	 
	}

	@Override
	public List<Reserva> listar() {
		// TODO Auto-generated method stub
		return null;
	}

}
