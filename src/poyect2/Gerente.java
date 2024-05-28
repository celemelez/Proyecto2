package poyect2;

public class Gerente extends Empleado {
	private double presupuesto;
	
	
	public Gerente(String nombre, String apellido, int numeroFiscal, String email, double remuneracion, int empleadoid,
			double presupuesto) {
		super(nombre, apellido, numeroFiscal, email, remuneracion, empleadoid);
		this.presupuesto = presupuesto;
	}

	public double getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(double presupuesto) {
		this.presupuesto = presupuesto;
	}

	@Override
	public String toString() {
		return super.toString()+" [presupuesto  "+" +  =  " + "  " +  presupuesto + "]";
	}


	



}
