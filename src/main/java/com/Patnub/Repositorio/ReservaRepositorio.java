package com.Patnub.Repositorio;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Patnub.Entidad.Reserva;

@Repository
public interface ReservaRepositorio extends CrudRepository <Reserva,Integer>{

	List<Reserva> findAll();

}
