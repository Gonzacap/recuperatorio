package recuperatorio.ejercicio01;

import java.time.LocalDate;

public class Prestacion {
	
	public enum Tipo {MEDICA, ODONTOLOGICA};
	
	private Practica practica;
	private LocalDate fecha;
	private Boolean preAprobada; 
	private Afiliado afiliado;
	private Tipo tipo;
	
	//CONSTRUCTOR
	
	public Prestacion(Practica p, Boolean aprobada, Afiliado a, Tipo t) {
		this.practica = p;
		this.afiliado = a;
		this.preAprobada = aprobada;
		this.tipo = t;
		this.fecha = LocalDate.now();
	}
	
	
	public Double getCosto() {
		
		if()
		
	}

}
