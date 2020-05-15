package dao;

import java.util.List;

import modelo.Cliente;

public interface ClienteDAO extends GenericDAO<Cliente, String>{
    public abstract List<Cliente> findByUserId(String cedula);
}

