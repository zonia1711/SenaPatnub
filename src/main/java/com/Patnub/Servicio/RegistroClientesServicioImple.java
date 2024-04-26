package com.Patnub.Servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import com.Patnub.Entidad.RegistroClientes;
import com.Patnub.Repositorio.RegistroClientesRepositorio;


public class RegistroClientesServicioImple {
	@Autowired
	private RegistroClientesRepositorio repositorio;
	public List<RegistroClientes> listarTodosLosCliente() {
		return repositorio.findAll();
	}

}


