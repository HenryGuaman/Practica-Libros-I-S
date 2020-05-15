package practica;

import java.util.ArrayList;

public class Cliente {

	private String cedula;
	private String nombre;
	private String apellido;
	private String telefono;
	private double credito;
	
	ArrayList<Cliente> clientes=new ArrayList();
	
	
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public double getCredito() {
		return credito;
	}
	public void setCredito(double credito) {
		this.credito = credito;
	}
	
	
	
	public ArrayList<Cliente> getClientes() {
		return clientes;
	}
	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}
	public Cliente(String cedula, String nombre, String apellido, String telefono, double credito) {
		
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.credito = credito;
	}
	public Cliente() {
		
	}
	
	
public void agregarCliente(Cliente cli) {
	
		
		clientes.add(cli);
		
	}
	
	
	public void imprimirClientes() {
		for (int i = 0; i <clientes.size(); i++) {
			
			System.out.println(clientes.get(i));
		}
	}
	@Override
	public String toString() {
		return "Cliente [cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono
				+ ", credito=" + credito + ", clientes=" + clientes + "]";
	}
	
	
	
	
}
