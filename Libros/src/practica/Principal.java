package practica;



public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*******Practica 02.02 ***********");
		System.out.println("CLIENTES AGREGADOS");
		Cliente c=new Cliente("0106662158","Juan","Perez","3014330",455.5);
		Cliente c1=new Cliente("0102266202","Nely","Fajardo","2584178",100.0);
		Cliente c2=new Cliente("0106661929","Erika","Orellana","7989454",500.0);
		
		Cliente cl=new Cliente();
		cl.agregarCliente(c);
		cl.agregarCliente(c1);
		cl.agregarCliente(c2);
		
		cl.imprimirClientes();
		
		LibroDigital l5=new LibroDigital();
		
		
		LibroDigital  l = new LibroDigital(1,"algebra","Marcelo durazno","primera",20.50);
		LibroDigital  l1 = new LibroDigital(2,"algebra1","Marcia Nieto","primera",30.0);
		LibroDigital  l2 = new LibroDigital(3,"algebra2","Karla Loja","primero",25.50);
		LibroDigital  l3 = new LibroDigital(4,"algebra3","juanito","primera",19.51);
		LibroDigital  l4 = new LibroDigital(5,"algebra4","pepito","primera",30.80);
		
		l5.agregarLibro(l);
		l5.agregarLibro(l1);
		l5.agregarLibro(l2);
		l5.agregarLibro(l3);
		l5.agregarLibro(l4);
		System.out.println("Libros Digitales Agregados");
		l5.imprimirLibros();
		
		System.out.println("Libro Digital con codigo 1 eliminado \n");
		l5.eliminarLibro(1);
		System.out.println("Libros Digitales Existentes\n");
		l5.imprimirLibros();
		
		LibroImpreso li1=new LibroImpreso(1,"Matematicas","Pedro infante","primera",15.50);
		LibroImpreso li2=new LibroImpreso(2,"Fisica","Maria","segunda",20.50);
		LibroImpreso li3=new LibroImpreso(3,"EESS","Marco infante","tercera",30.00);
		LibroImpreso li4=new LibroImpreso(4,"Literatura","Mauricio","primera",10.00);
		LibroImpreso lif=new LibroImpreso();
		
		System.out.println("\n Agregando libros Impresos\n");
		lif.agregarLibro(li1);
		lif.agregarLibro(li2);
		lif.agregarLibro(li3);
		lif.agregarLibro(li4);
		
		lif.imprimirLibros();
		
		System.out.println("\n Libro impreso con codigo 1 eliminado \n");
		lif.eliminarLibro(1);
		System.out.println("\n Libros Impresos Existentes \n");
		lif.imprimirLibros();
		
		Factura f=new Factura();
		Factura f1=new Factura();
		Factura f2=new Factura();
		
		System.out.println("\n Generando Facturas \n");
		
		f.calcularFactura(1,c1, l, 2, 5);
		f1.calcularFactura(2,c2, li1, 1, 3);
		f2.calcularFactura(3,c, l1, 2, 7);
		
		System.out.println("\nImpresion Factura Venta Libro Impreso\n");
		f.imprimirFactura();
		System.out.println("\nImpresion Factura Venta Libro Digital\n");
		f1.imprimirFactura();
		System.out.println("\nImpresion Factura Venta Libro Impreso\n");
		f2.imprimirFactura();
		
		System.out.println("\nCompras\n");
		
		Compra com= new Compra(1,f);
		Compra com1= new Compra(2,f1);
		Compra com2= new Compra(3,f2);
		
		Compra compra =  new Compra();
		
		compra.agregarCompra(com);
		compra.agregarCompra(com1);
		compra.agregarCompra(com2);
		
		
		System.out.println("\nImprimiendo Registro de Compras\n");
		
		compra.imprimirCompras();
		
	}

}
