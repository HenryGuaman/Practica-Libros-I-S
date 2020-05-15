package modelo;

public class Factura {

	private int id_factura;
	private Double precio_unitario;
	private int precio;
	private Double total_venta;
	private Cliente cliente;
	private LibroImpreso fisico;
	private LibroDigital digital;
	
	
	public int getId_factura() {
		return id_factura;
	}
	public void setId_factura(int id_factura) {
		this.id_factura = id_factura;
	}
	public Double getPrecio_unitario() {
		return precio_unitario;
	}
	public void setPrecio_unitario(Double precio_unitario) {
		this.precio_unitario = precio_unitario;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public Double getTotal_venta() {
		return total_venta;
	}
	public void setTotal_venta(Double total_venta) {
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
	@Override
	public String toString() {
		return "Factura [id_factura=" + id_factura + ", precio_unitario=" + precio_unitario + ", precio=" + precio
				+ ", total_venta=" + total_venta + ", cliente=" + cliente + ", fisico=" + fisico + ", digital="
				+ digital + "]";
	}
	public Factura(int id_factura, Double precio_unitario, int precio, Double total_venta, Cliente cliente,
			LibroImpreso fisico, LibroDigital digital) {
		
		this.id_factura = id_factura;
		this.precio_unitario = precio_unitario;
		this.precio = precio;
		this.total_venta = total_venta;
		this.cliente = cliente;
		this.fisico = fisico;
		this.digital = digital;
	}
	public Factura() {
		
	}
	
	
	
	
}
