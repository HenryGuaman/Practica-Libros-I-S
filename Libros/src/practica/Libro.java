package practica;



public abstract class Libro{

	private int id;
	private String titulo;
	private String autor;
	private String edicion;
	private double precio;
	
	
	double comision;

	public Libro(int id, String titulo, String autor, String edicion, double precio) {
		
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
		this.edicion = edicion;
		this.precio = precio;
	}
	public Libro() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEdicion() {
		return edicion;
	}
	public void setEdicion(String edicion) {
		this.edicion = edicion;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
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
	@Override
	public String toString() {
		return "Libro [id=" + id + ", titulo=" + titulo + ", autor=" + autor + ", edicion=" + edicion + ", precio="
				+ precio + ", comision=" + comision + "]";
	}
	
	
	
	
}
