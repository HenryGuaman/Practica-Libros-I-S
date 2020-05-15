package dao;

import java.util.List;

import modelo.LibroImpreso;

public interface LibroImpresoDAO extends GenericDAO<LibroImpreso, Integer>{
    public abstract List<LibroImpreso> findByUserId(int id);
}

