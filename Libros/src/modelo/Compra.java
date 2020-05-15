package modelo;

public class Compra {

	private int id_compra;
	private Cliente cliente;
    private Factura factura;
	public int getId_compra() {
		return id_compra;
	}
	public void setId_compra(int id_compra) {
		this.id_compra = id_compra;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Factura getFactura() {
		return factura;
	}
	public void setFactura(Factura factura) {
		this.factura = factura;
	}
	public Compra(int id_compra, Cliente cliente, Factura factura) {
		
		this.id_compra = id_compra;
		this.cliente = cliente;
		this.factura = factura;
	}
	public Compra() {
		super();
	}
    
	
	
    
	
	
	
	
}
