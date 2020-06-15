package recuperatorio.ejercicio01;

public class PlanPlus extends Afiliado{

	private Tipo PLUS;
	private Tipo tipo = PLUS;
	private Long cuitEmpleador;
	
	//CONSTRUCTOR
	
	public PlanPlus(String nombre, String email, Long dni,String fecha, Double p, Long cuit) {
		
		super(nombre, email, dni, fecha, p);
		this.cuitEmpleador = cuit;
	}
	
}
