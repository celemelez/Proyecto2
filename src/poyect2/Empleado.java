package poyect2;

public class Empleado extends Personas {
	private double remuneracion;
	private int Empleadoid;

	public Empleado(String nombre, String apellido, int numeroFiscal, String email, double remuneracion,
			int empleadoid) {
		super(nombre, apellido, numeroFiscal, email);
		this.remuneracion = remuneracion;
		Empleadoid = empleadoid;
	}


	public double getRemuneracion() {
		return remuneracion;
	}
	public int getEmpleadoid() {
		return Empleadoid;
	}
	public void aumentaRemuneracion(int porcentaje){
		
		double aumento = (this.getRemuneracion() * 100) /porcentaje;
		this.setRemuneracion(this.getRemuneracion() + aumento);
	}



	private void setRemuneracion(double d) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public String toString() {
		return super.toString()+"  Empleado [remuneracion  =  " + remuneracion + ", Empleadoid  =  " + Empleadoid + "]";
	}
	
	

	
	

	

}
