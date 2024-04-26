package com.Patnub.Servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Patnub.Entidad.Ingreso;
import com.Patnub.InterfaceService.IIngreso;
import com.Patnub.Repositorio.IngresoRepositorio;

@Service
public class IngresoServicio implements IIngreso {

	@Autowired 
	private IngresoRepositorio<?> repositorio;
	 public List<Ingreso> listarTodosLosUsuario(){
		return repositorio.findAll();
		 
	 }
	 @Override
	 public void save(Ingreso usuario) {
	     repositorio.save(usuario);
	 }
}
