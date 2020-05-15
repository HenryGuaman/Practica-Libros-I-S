package modelo;

public class Compra {

	private int id_compra;
    private Factura factura;
	public int getId_compra() {
		return id_compra;
	}
	public void setId_compra(int id_compra) {
		this.id_compra = id_compra;
	}
	
	public Factura getFactura() {
		return factura;
	}
	public void setFactura(Factura factura) {
		this.factura = factura;
	}
	public Compra(int id_compra, Cliente cliente, Factura factura) {
		
		this.id_compra = id_compra;
		this.factura = factura;
	}
	public Compra() {
		super();
	}
    
	
	
    
	
	
	
	
}
