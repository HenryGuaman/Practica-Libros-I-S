/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;



import java.util.List;

import dao.ClienteDAO;
import modelo.Cliente;


public class JDBClienteDAO extends JDBCGenericDAO<Cliente, String> implements ClienteDAO {
    
	@Override
    public void createTable() {
        conexionUno.update("CREATE TABLE IF NOT EXISTS cliente ("
               
                + "	cli_nombre VARCHAR(20),"
                + "	cli_apellido  VARCHAR(50),"
                + "	cli_cedula VARCHAR(50), NOT NULL"
                + "	cli_telefono VARCHAR(50),"
                + "	cli_credito DOUBLE(10,10),"
                + "	PRIMARY KEY (cli_cedula)"
                + ");");
    }
    
   
    
    @Override
    public boolean create(Cliente cli) {
        
        return conexionUno.update("INSERT INTO usuario VALUES ('" + cli.getNombre()+ "', '" + cli.getApellido() + "', '" + cli.getCedula() + "', '" + cli.getTelefono() + "', '" + cli.getCredito() + "');");        
    }
    
  

    @Override
    public boolean update(Cliente cli) {
        return conexionUno.update("UPDATE cliente SET "
        		
                + "	cli_nombre" + cli.getNombre() + "',"
                + "	cli_apellido" + cli.getApellido() + "',"
                + "	cli_telefono" + cli.getTelefono() + "',"
                + "	cli_credito " + cli.getCredito() + "',"
                + " WHERE cli_cedula " + cli.getCedula() + "';");
                
    }
    @Override
    public boolean delete(Cliente cli) {
        return conexionUno.update("UPDATE cliente SET "
                + "	WHERE usu_cedula = '" + cli.getCedula() + "';");
    }



	@Override
	public Cliente findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public List<Cliente> find() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public List<Cliente> findByUserId(String cedula) {
		// TODO Auto-generated method stub
		return null;
	}
    
}
