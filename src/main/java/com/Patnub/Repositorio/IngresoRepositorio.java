package com.Patnub.Repositorio;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.Patnub.Entidad.Ingreso;

public interface IngresoRepositorio<Intenger> extends CrudRepository<Ingreso, Intenger>{

	List<Ingreso> findAll();


}
