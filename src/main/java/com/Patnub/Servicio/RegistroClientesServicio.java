package com.Patnub.Servicio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Patnub.Entidad.RegistroClientes;
import com.Patnub.InterfaceService.IRegistroClientes;
import com.Patnub.Repositorio.RegistroClientesRepositorio;

@Service
public class RegistroClientesServicio implements IRegistroClientes {

    @Autowired
    private RegistroClientesRepositorio registroClientesRepositorio;

    @Override
    public List<RegistroClientes> listar() {
        return (List<RegistroClientes>) registroClientesRepositorio.findAll();
    }

    @Override
    public Optional<RegistroClientes> listarClienteID(int clienteID) {
        return registroClientesRepositorio.findById(clienteID);
    }

    @Override
    public RegistroClientes save(RegistroClientes clientes) {
        return registroClientesRepositorio.save(clientes);
    }

    @Override
    public void delete(int clienteID) {
        registroClientesRepositorio.deleteById(clienteID);
    }
}
