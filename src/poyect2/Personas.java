package poyect2;

public class Personas {
	private String nombre;
	private String apellido;
	private int numeroFiscal; 
	private String email;
	
	public Personas() {
		super();
	}
	
	
	
	
	public Personas(String nombre, String apellido, int numeroFiscal, String email) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.numeroFiscal = numeroFiscal;
		this.email = email;
	}




	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public int getNumeroFiscal() {
		return numeroFiscal;
	}
	public String getEmail() {
		return email;
	}
	
	

	@Override
	public String toString() {
		return "Personas [nombre  =  " + nombre + ", apellido  =  " + apellido + ", numeroFiscal  =  " + numeroFiscal + ", email  =  "
				+ email + "]";
	}
	
	

}
