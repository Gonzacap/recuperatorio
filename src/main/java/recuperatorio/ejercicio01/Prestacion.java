package recuperatorio.ejercicio01;

import java.time.LocalDate;

import recuperatorio.ejercicio01.Afiliado.Tipo;

public class Prestacion {
	
	public enum TipoP {MEDICA, ODONTOLOGICA};
	
	private Practica practica;
	private LocalDate fecha;
	private Boolean preAprobada; 
	private Afiliado afiliado;
	private TipoP tipo;
	
	//CONSTRUCTOR
	
	public Prestacion(Practica p, Boolean aprobada, Afiliado a, TipoP t) {
		this.practica = p;
		this.afiliado = a;
		this.preAprobada = aprobada;
		this.tipo = t;
		this.fecha = LocalDate.now();
	}
	
	//---
	
	public Double getCosto(Tipo tipoAfiliado) {
		
		if(this.tipo==TipoP.MEDICA) {
			
			if(afiliado.getTipo()== Tipo.JOVEN) {
				
				return (this.practica.getCosto()*0.20)+150;
			}
			else { //asumo que es PLUS
				
				return (this.practica.getCosto()*0.25);
			}
		}
		else { //asumo que es ODONTOLOGICA
			
			if(afiliado.getTipo()== Tipo.JOVEN) {
				
				return (this.practica.getCosto()*0.80);
			}
			else { //asumo que es PLUS
				
				return (this.practica.getCosto()*0.50);
			}
		}
	}

}
