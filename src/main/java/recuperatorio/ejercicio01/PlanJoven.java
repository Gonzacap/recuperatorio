package recuperatorio.ejercicio01;

//import recuperatorio.ejercicio01.Afiliado.Tipo;

public class PlanJoven extends Afiliado {
	
	private Tipo JOVEN;
	private Tipo tipo = JOVEN;
	private String universidad;
	private String carrera;
	
	//CONSTRUCTOR
	
	public PlanJoven(String nombre, String email, Long dni,String fecha, Double p, String uni, String carrera) {
		
		super(nombre, email, dni, fecha, p);
		this.universidad = uni;
		this.carrera = carrera;
	}
	
	@Override
	public double facturar() {
		
		Double total = 0.0;
		
		for(Prestacion p: super.prestaciones) {
			
			total += p.getCosto(this.tipo);
		}
		
		return total;
	}

}
