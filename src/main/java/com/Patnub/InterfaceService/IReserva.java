package com.Patnub.InterfaceService;


import java.util.List;

import com.Patnub.Entidad.Reserva;

public interface IReserva {

public Reserva save(Reserva reserva);

	List<Reserva> listar();
}
