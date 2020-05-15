package practica;

import java.util.ArrayList;

public class Compra {

	private int id_compra;
    private Factura factura;
    
    private ArrayList<Compra> compra=new ArrayList();
    
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
	public ArrayList<Compra> getCompra() {
		return compra;
	}
	public void setCompra(ArrayList<Compra> compra) {
		this.compra = compra;
	}
	
	//Constructor
	public Compra(int id_compra, Factura factura) {
		
		this.id_compra = id_compra;
		this.factura = factura;
	}
	public Compra() {
	}
	
	
	@Override
	public String toString() {
		return "Compra [id_compra=" + id_compra + ", factura=" + factura  + "]";
	}
    
	
	//Metodos..
	
	public void agregarCompra(Compra compras) {
		compra.add(compras);
	}
	
	
	public void imprimirCompras() {
		for (int i = 0; i <compra.size(); i++) {
			
			System.out.println(compra.get(i));
		}
	}
	
	
	
	
	
    
	
	
	
	
}
