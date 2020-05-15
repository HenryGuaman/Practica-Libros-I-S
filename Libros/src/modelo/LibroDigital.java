package modelo;

public class LibroDigital extends Libro{
	double comision;
	public LibroDigital(int id, String titulo, String autor, String edicion, Double precio, String tipo) {
		super(id, titulo, autor, edicion, precio, tipo);
		// TODO Auto-generated constructor stub
	}

	public void calcularComision() {
		
		this.setPrecio(this.getPrecio() + comision);
		
	}
	
	
	
	public double getComision() {
		return comision;
	}

	public void setComision(double comision) {
		this.comision = comision;
	}
	
	
	
	
    
    
    

  
	
}
