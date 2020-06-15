package recuperatorio.ejercicio01;

import java.util.List;

public class Afiliado {
	
	public enum Tipo {PLUS, JOVEN};
	
	protected String nombre;
	protected String email; 
	protected Long dni; 
	protected String fechaNac;//?
	protected Tipo tipo;
	protected Double porcentaje;
	protected List<Prestacion> prestaciones;
	
	//CONSTRUCTOR
	
	public Afiliado(String nombre, String email, Long dni,String fecha, Double p) {
		this.nombre = nombre;
		this.email = email;
		this.dni = dni;
		this.fechaNac = fecha;
		this.porcentaje = p;
	}
	
	//--------------
	
	/* Implementar el método registrar prestación a un afiliado, donde se agregue a la lista de prestaciones recibidas una prestación*/

	public double facturar(){
		return 0.0;
	}
	
	//getters y setters
	
	public Tipo getTipo(){
		return this.tipo;
	}
	
	public void registrarPrestacion(Prestacion p) {
		this.prestaciones.add(p);
	}
	
}
