package com.Patnub.Servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Patnub.Entidad.Reserva;
import com.Patnub.InterfaceService.IReserva;
import com.Patnub.Repositorio.ReservaRepositorio;

@Service
public class ReservaServicioImple implements IReserva {

    @Autowired
    private ReservaRepositorio reservaRepositorio;

    @Override
    public Reserva save(Reserva reserva) {
        return reservaRepositorio.save(reserva);
    }

    @Override
    public List<Reserva> listar() {
        return reservaRepositorio.findAll();
    }
}