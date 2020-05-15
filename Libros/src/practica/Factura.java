package practica;

import java.util.ArrayList;

public class Factura {

	private int id_factura;
	private double preciototal;
	private int cantidad;
	private double total_venta;
	private Cliente cliente;
	private LibroImpreso fisico;
	private LibroDigital digital;
	private Libro libro;
	
	private ArrayList<Factura> factura=new ArrayList();
	
	
	
	
	public int getId_factura() {
		return id_factura;
	}


	public void setId_factura(int id_factura) {
		this.id_factura = id_factura;
	}


	public double getPreciototal() {
		return preciototal;
	}


	public void setPreciototal(double preciototal) {
		this.preciototal = preciototal;
	}


	public int getCantidad() {
		return cantidad;
	}


	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}


	public double getTotal_venta() {
		return total_venta;
	}


	public void setTotal_venta(double total_venta) {
		this.total_venta = total_venta;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public LibroImpreso getFisico() {
		return fisico;
	}


	public void setFisico(LibroImpreso fisico) {
		this.fisico = fisico;
	}


	public LibroDigital getDigital() {
		return digital;
	}


	public void setDigital(LibroDigital digital) {
		this.digital = digital;
	}
	
	

	public Libro getLibro() {
		return libro;
	}


	public void setLibro(Libro libro) {
		this.libro = libro;
	}


	public ArrayList<Factura> getFactura() {
		return factura;
	}


	public void setFactura(ArrayList<Factura> factura) {
		this.factura = factura;
	}


	public Factura(int id_factura, double preciototal, int cantidad, double total_venta, Cliente cliente,
			Libro libro) {
		super();
		this.id_factura = id_factura;
		this.preciototal = preciototal;
		this.cantidad = cantidad;
		this.total_venta = total_venta;
		this.cliente = cliente;
		this.libro = libro;
	}


	public Factura() {
		
	}
	

	public void calcularFactura(int codigo, Cliente cliente, Libro libro, int num, int cantidad) {
		
		double preciototal1=0;
		double totalventa1=0;
		
		if (num == 1) {
			
			preciototal1=libro.getPrecio()+libro.getComision();
			
			
		}else if(num==2) {
			
			double t=libro.getPrecio()*0.02;
			preciototal1= libro.getPrecio()+20+t;
			
		}
		
		
		totalventa1 = cantidad*preciototal1;
		//System.out.println("Nombre: "+ cliente.getNombre()+" " + cliente.getApellido() + " "+ libro.getTitulo()+" Valor Total de Factura: "+ preciototal1);
		
		Factura f=new Factura();
		f.setId_factura(codigo);

		f.setCliente(cliente);
		f.setLibro(libro);
		f.setCantidad(cantidad);
		f.setPreciototal(preciototal1);
		f.setTotal_venta(totalventa1);
		factura.add(f);
		
	}

	
	public void imprimirFactura() {
		for (int i = 0; i <factura.size(); i++) {
			
			System.out.println(factura.get(i));
		}
	}


	@Override
	public String toString() {
		return "Factura [id_factura=" + id_factura + ", preciototal=" + preciototal + ", cantidad=" + cantidad
				+ ", total_venta=" + total_venta + ", cliente=" + cliente + ", libro=" + libro + "]";
	}


	
	
	
	
}
