package dao;

import java.util.List;

import modelo.LibroDigital;

public interface LibroDigitalDAO extends GenericDAO<LibroDigital, Integer>{
    public abstract List<LibroDigital> findByUserId(int id);
}

