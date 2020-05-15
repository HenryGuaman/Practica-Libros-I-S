package modelo;


public abstract class Libro{

	private int id;
	private String titulo;
	private String autor;
	private String edicion;
	private Double precio;
	public abstract double comision();
    public abstract double envio();
    public abstract double costo();
	

	public Libro() {
		
	}
	public Libro(int id, String titulo, String autor, String edicion, Double precio, String tipo) {
		
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
		this.edicion = edicion;
		this.precio = precio;
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
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	
	
	
	
}
