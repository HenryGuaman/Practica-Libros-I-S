package practica;

import java.util.ArrayList;
import java.util.List;

public class LibroDigital extends Libro{
	
	
	double comision =20.0;
	private ArrayList<LibroDigital> libro1=new ArrayList();
	
	
	
	
	public LibroDigital(int id, String titulo, String autor, String edicion, double precio) {
		super(id, titulo, autor, edicion, precio);
	}
	
	
	public ArrayList<LibroDigital> getLibro1() {
		return libro1;
	}


	public void setLibro1(ArrayList<LibroDigital> libro1) {
		this.libro1 = libro1;
	}


	public double getComision() {
		return comision;
	}

	public void setComision(double comision) {
		this.comision = comision;
	}
	
	public void agregarLibro(LibroDigital libros) {
	
		
		libro1.add(libros);
		
	}
	
	public void eliminarLibro(int codigo) {
		
		libro1.remove(codigo);
		
	}
	
	public void imprimirLibros() {
		for (int i = 0; i <libro1.size(); i++) {
			
			System.out.println(libro1.get(i));
		}
	}

	public LibroDigital() {
		
	}


	
    

  
	
}
