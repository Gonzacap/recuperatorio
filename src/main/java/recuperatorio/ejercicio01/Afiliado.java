package recuperatorio.ejercicio01;

import java.util.List;

public class Afiliado {
	
	public enum Tipo {PLUS, JOVEN};
	
	private String nombre;
	private String email; 
	private Long dni; 
	private String fechaNac;//?
	private Tipo tipo;
	private Double porcentaje;
	private List<Prestacion> prestaciones;
	
	//CONSTRUCTOR
	
	public Afiliado(String nombre, String email, Long dni,String fecha, Double p) {
		this.nombre = nombre;
		this.email = email;
		this.dni = dni;
		this.fechaNac = fecha;
		this.porcentaje = p;
	}
	
	/* Implementar el método registrar prestación a un afiliado, donde se agregue a la lista de prestaciones recibidas una prestación*/
	
	
	public double facturar() {
		return 0.0;
	}
	
	public Tipo getTipo(){
		return this.tipo;
	}
}
