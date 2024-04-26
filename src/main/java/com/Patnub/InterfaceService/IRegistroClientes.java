package com.Patnub.InterfaceService;

import java.util.List;
import java.util.Optional;
import com.Patnub.Entidad.RegistroClientes;

public interface IRegistroClientes {

    public List<RegistroClientes> listar();

    public RegistroClientes save(RegistroClientes clientes);

    public void delete(int clienteID);

    public Optional<RegistroClientes> listarClienteID(int clienteID);
}
