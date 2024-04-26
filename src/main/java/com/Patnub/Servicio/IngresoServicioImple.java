package com.Patnub.Servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Patnub.Entidad.Ingreso;
import com.Patnub.Repositorio.IngresoRepositorio;

@Service //  la anotación Service sirve para Spring pueda escanear y administrar esta clase como un servicio.
public class IngresoServicioImple {

    @Autowired
    private IngresoRepositorio<?> repositorio;
    
    public List<Ingreso> listarTodosLosIngresos() {
        return repositorio.findAll();
    }
}