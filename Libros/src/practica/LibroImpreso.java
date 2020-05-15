package practica;

import java.util.ArrayList;

public class LibroImpreso extends Libro {

	private ArrayList<LibroImpreso> libro1=new ArrayList();
	
	public LibroImpreso() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LibroImpreso(int id, String titulo, String autor, String edicion, Double precio) {
		super(id, titulo, autor, edicion, precio);
		// TODO Auto-generated constructor stub
	}

	public void agregarLibro(LibroImpreso libros) {
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
    

	
	
}
