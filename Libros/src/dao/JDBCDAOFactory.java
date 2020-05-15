/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


public class JDBCDAOFactory extends DAOFactory{

	@Override
	public void createTables() {
		this.getClienteDAO().createTable();
        this.getLibroDigitalDAO().createTable();
        this.getLibroImpresoDAO().createTable();
		
	}/*

	@Override
	public ClienteDAO getClienteDAO() {
		// TODO Auto-generated method stub
		return new JDBClienteDAO();
	}

	@Override
	public LibroDigitalDAO getLibroDigitalDAO() {
		// TODO Auto-generated method stub
		return new JDBCLibroDigitalDAO();
	}

	@Override
	public LibroImpresoDAO getLibroImpresoDAO() {
		// TODO Auto-generated method stub
		return new JDBCLibroImpresoDAO();
	}

	*/

	@Override
	public ClienteDAO getClienteDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LibroDigitalDAO getLibroDigitalDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LibroImpresoDAO getLibroImpresoDAO() {
		// TODO Auto-generated method stub
		return null;
	}
    
}
