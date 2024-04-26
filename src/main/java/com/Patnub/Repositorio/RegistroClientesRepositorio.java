package com.Patnub.Repositorio;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Patnub.Entidad.RegistroClientes;

@Repository

public interface RegistroClientesRepositorio extends CrudRepository<RegistroClientes, Integer> {

	List<RegistroClientes> findAll();
}