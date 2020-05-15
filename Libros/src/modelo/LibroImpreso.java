package modelo;

public class LibroImpreso extends Libro {

	private double comision;
    private double envio;
    private double costo;
    
    
    
	public LibroImpreso(int id, String titulo, String autor, String edicion, Double precio, String tipo,
			double comision, double envio, double costo) {
		super(id, titulo, autor, edicion, precio, tipo);
		this.comision = comision;
		this.envio = envio;
		this.costo = costo;
	}


	@Override
    public double comision() {
        return this.comision;
    }

    @Override
    public double envio() {
        return this.envio;
    }

    @Override
    public double costo() {
        return this.costo;
    }
    
    

	
	
}
