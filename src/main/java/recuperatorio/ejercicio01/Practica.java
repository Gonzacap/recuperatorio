package recuperatorio.ejercicio01;

public class Practica {
	
	private String desc; 
	private Integer codigo;
	private Double costo;
	
	//CONSTRUCTOR
	
	public Practica(String desc, Integer cod, Double costo) {
		
		this.codigo = cod;
		this.costo = costo;
		this.desc = desc;
	}

	//----
	
	public Double getCosto() {
		return this.costo;
	}
	
}
